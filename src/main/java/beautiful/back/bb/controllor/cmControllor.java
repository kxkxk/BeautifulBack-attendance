package beautiful.back.bb.controllor;

import beautiful.back.bb.annotation.UserLoginToken;
import beautiful.back.bb.entry.Attend;
import beautiful.back.bb.entry.Class;
import beautiful.back.bb.entry.Course;
import beautiful.back.bb.entry.Teachers;
import beautiful.back.bb.service.AttendService;
import beautiful.back.bb.service.ClassService;
import beautiful.back.bb.service.CourseService;
import beautiful.back.bb.service.TeachersService;
import beautiful.back.bb.service.impl.tools;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
//未测试
@RestController
@RequestMapping("cm")
public class cmControllor {
    @Autowired
    CourseService courseService;
    @Autowired
    ClassService classService;
    @Autowired
    TeachersService teachersService;
    @Autowired
    AttendService attendService;
    /**
     * 新建课程
     * @param tid
     * @param name
     * @param majorId
     * @param sNum
     * @return
     */
    @UserLoginToken
    @RequestMapping("new")
    String create(HttpServletRequest httpServletRequest, String tid, String name, String majorId, String[] sNum){
        String token = httpServletRequest.getHeader("token");
        if(!tools.isTeacher(token) || !tools.isAdmin(token)){
            return "权限不足";
        }
        String cno = tools.getUUID();
        String clno = tools.getUUID();
        Course course = new Course(cno,name,teachersService.findTnoByUuid(tid),"1",clno);
        if(courseService.addCourse(course)){
            for (String i : sNum){
                Class cla = new Class(tools.getUUID(),clno,i);
                classService.addStudent(cla);
            }
            return cno;
        }
        return "创建失败";
    }

    /**
     * 返回指定课程的详细信息
     * @param cid
     * @return
     */
    @RequestMapping("info")
    @UserLoginToken
    Object info(String cid){
        JSONObject jsonObject = new JSONObject();
        Course course = courseService.findCourseByCno(cid);
        Teachers teachers = teachersService.findTeacherByTno(course.getTno());
        List<String> sNum = classService.findSnoByClno(course.getClno());
        Date nowDate = new Date();
        List<Attend> attends = attendService.findAttendByCno(cid);
        boolean isattend = false;
        for (Attend i : attends) {
            if(tools.judgeDateBetween(i.getStartdate(),i.getEnddate(),nowDate)){
                isattend = true;
                break;
            }
        }
        jsonObject.put("tid",teachers.getUuid());
        jsonObject.put("name",course.getCname());
        jsonObject.put("majorId",teachers.getMno());
        jsonObject.put("sNum",sNum);
        jsonObject.put("isattend",isattend);
        return jsonObject;
    }

    /**
     * 修改指定课程的信息
     * @param cid
     * @param tid
     * @param name
     * @param majorId
     * @param sNum
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("infoedit")
    @UserLoginToken
    String infoEdit(String cid,String tid,String name,String majorId,String[] sNum,HttpServletRequest httpServletRequest){
        String token = httpServletRequest.getHeader("token");
        if(!tools.isTeacher(token) || !tools.isAdmin(token)){
            return "权限不足";
        }
        Course course = new Course();
        course.setCno(cid);
        course.setCname(name);
        course.setTno(tid);
        if(courseService.changeCourse(course)){
            if(sNum.length>0){
                String clno = courseService.findClnoByCno(cid);
                classService.delStudentsByClno(clno);
                for (String i : sNum){
                    classService.addStudent(new Class(tools.getUUID(),clno,i));
                }
            }
            return cid;
        }
        return "总之就是有问题";
    }

    /**
     * 删除课程信息
     * @param httpServletRequest
     * @param cid
     * @return
     */
    @RequestMapping("remove")
    @UserLoginToken
    String remove(HttpServletRequest httpServletRequest,String cid){
        String token = httpServletRequest.getHeader("token");
        if(!tools.isTeacher(token) || !tools.isAdmin(token)){
            return "权限不足";
        }
        try {
            courseService.removeCourseByCid(cid);
        }catch (Exception e){
            return "有毛病";
        }
        return cid;
    }

    /**
     * 查找该课程的所有的考勤
     * @param cid
     * @return
     */
    @UserLoginToken
    @RequestMapping("attend")
    Object attend(String cid){
        Date date = new Date();
        List<Attend> attendList = attendService.findAttendByCno(cid);
        for (Attend i : attendList) {
            if(tools.judgeDateBetween(i.getStartdate(),i.getEnddate(),date))
                i.setStatus(2);
            else if(i.getEnddate().before(date)){
                i.setStatus(3);
            }
        }
        return attendList;
    }












}
