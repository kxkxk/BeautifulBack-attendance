package beautiful.back.bb.controllor;

import beautiful.back.bb.annotation.UserLoginToken;
import beautiful.back.bb.entry.Attend;
import beautiful.back.bb.entry.Record;
import beautiful.back.bb.entry.Students;
import beautiful.back.bb.service.*;
import beautiful.back.bb.service.impl.tools;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

//全部未测试
@RestController
@RequestMapping("am")
public class amControllor {
    @Autowired
    AttendService attendService;
    @Autowired
    RecordService recordService;
    @Autowired
    StudentsService studentsService;
    @Autowired
    CourseService courseService;
    @Autowired
    ClassService classService;


    /**
     * 创建考勤
     * @param sTime
     * @param eTime
     * @param tid
     * @param info
     * @param sNum
     * @param cid
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("new")
    @UserLoginToken
    String createAttend(long sTime, long eTime, String tid, String info, String[] sNum, String cid, HttpServletRequest httpServletRequest){
        if(!tools.isTeacher(httpServletRequest.getHeader("token"))){
            return "权限不足";
        }
        Date st = tools.stampToDate(sTime);
        Date et = tools.stampToDate(eTime);
        int status = 1;        //考勤状态 1未开始2进行中3结束4被取消
        String uuid = tools.getUUID();
        Attend attend  = new Attend(uuid,cid,tid,info,status,st,et);
        if(attendService.addAttend(attend)){
            String clno = courseService.findClnoByCno(cid);
            List<String> sno = classService.findSnoByClno(clno);
            for (String i : sno){
                recordService.addRecord(new Record(1, uuid, i, st, 0));
            }
            if(sNum.length>0) {
                for (String i : sNum) {
                    int type = 3;//考勤状态 0缺勤 1出勤 2迟到 3请假 4早退
                    recordService.changeStatuByAtnoAndSno(uuid,i,type,st);
                }
            }
            return uuid;
        }
        return "添加失败";
    }

    /**
     * 获取考勤信息
     * @param httpServletRequest
     * @param aid
     * @return
     */
    @UserLoginToken
    @RequestMapping("info")
    Attend info(HttpServletRequest httpServletRequest,String aid){
        Attend attend = attendService.findAttendByAtno(aid);
        Date nowDate = new Date();
        if(tools.judgeDateBetween(attend.getStartdate(),attend.getEnddate(),nowDate)){
            attend.setStatus(2);
        }else if(nowDate.before(attend.getStartdate())) attend.setStatus(1);
        else if(nowDate.after(attend.getEnddate())) attend.setStatus(3);
        return attend;
    }

    /**
     * 修改考勤信息
     * @param httpServletRequest
     * @param aid
     * @param sTime
     * @param eTime
     * @param info
     * @param sNum
     * @return
     */
    @UserLoginToken
    @RequestMapping("infoedit")
    String infoEdit(HttpServletRequest httpServletRequest,String aid,long sTime,long eTime,String info,String[] sNum){
        String token = httpServletRequest.getHeader("token");
        Date st = tools.stampToDate(sTime), et = tools.stampToDate(eTime);
        if(!(tools.isTeacher(token)||tools.isTeacher(token))){
            return "权限不足";
        }
        Attend attend = new Attend();
        attend.setAtno(aid);
        attend.setStartdate(st);
        attend.setEnddate(et);
        attend.setRemarks(info);
        if(attendService.updateAttend(attend)){
            for (String i : sNum) {
                int type = 3;
                //考勤状态 0缺勤 1出勤 2迟到 3请假 4早退
                recordService.changeStatuByAtnoAndSno(aid,i,type,st);
            }
            return aid;
        }
        return "修改失败";
    }

    /**
     * 删除考勤
     * @param httpServletRequest
     * @param aid
     * @return
     */
    @UserLoginToken
    @RequestMapping("remove")
    String remove(HttpServletRequest httpServletRequest,String aid) {
        String token = httpServletRequest.getHeader("token");
        if(!(tools.isTeacher(token)||tools.isAdmin(token))) return "权限不足";
        if(attendService.delAttend(aid)) return aid;
        return "删除失败";
    }

    /**
     * 取消一次考勤
     * @param httpServletRequest
     * @param aid
     * @return
     */
    @UserLoginToken
    @RequestMapping("cancel")
    String cancel(HttpServletRequest httpServletRequest,String aid){
        String token = httpServletRequest.getHeader("token");
        if(!(tools.isTeacher(token)||tools.isAdmin(token))) return "权限不足";
        if(attendService.cancelAttend(aid)) return aid;
        return "取消失败";
    }

    /**
     * 学生考勤
     * @param sid
     * @param aid
     * @param status
     * @return
     */
    @UserLoginToken
    @RequestMapping("signIn")
    String signIn(String sid,String aid,int status){
        Date date = new Date();
        if(recordService.changeStatuByAtnoAndSno(aid,studentsService.getStudentInfo(sid).getSno(),1,date))
            return sid;
        return "考勤失败";
    }

    /**
     * 考勤中不同状态的学生数量
     * @param aid
     * @return
     */
    @RequestMapping("numdata")
    @UserLoginToken
    int[] numData(String aid){
        int[] res = new int[5];
        String cno = attendService.findAttendByAtno(aid).getCno();
        String clno = courseService.findClnoByCno(cno);
        int sum = classService.getAllStudentsByClno(clno);
        //已签到
        int signNum = recordService.findStudentCountByAtnoAndType(aid,1);
        //请假
        int leaveNum = recordService.findStudentCountByAtnoAndType(aid,2);
        // 迟到
        int lateNum = recordService.findStudentCountByAtnoAndType(aid,3);
        // 早退
        int earlyNum = recordService.findStudentCountByAtnoAndType(aid,4);
        // 旷课
        int absentNum = recordService.findStudentCountByAtnoAndType(aid,0);
        res[0] = absentNum; res[1] = signNum;res[2] = leaveNum;res[3] = lateNum;res[4] = earlyNum;
        return res;
    }

    /**
     * 返回考勤所有的学生信息和状态
     * @param aid
     * @return
     */
    @UserLoginToken
    @RequestMapping("data")
    Object data(String aid){
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        List<Record> records = recordService.findRecordByAtno(aid);
        for (Record i : records) {
            Students students = studentsService.getStudentInfoBySno(i.getSno());
            jsonObject.put("sid",students.getUuid());
            jsonObject.put("sNum",students.getSno());
            jsonObject.put("status",i.getType());
            jsonObject.put("name",students.getSname());
            jsonArray.add(jsonObject);
        }
        return jsonArray;
    }




}
