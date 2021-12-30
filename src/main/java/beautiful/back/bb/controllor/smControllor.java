package beautiful.back.bb.controllor;

import beautiful.back.bb.annotation.UserLoginToken;
import beautiful.back.bb.entry.Attend;
import beautiful.back.bb.entry.Course;
import beautiful.back.bb.entry.Record;
import beautiful.back.bb.entry.Students;
import beautiful.back.bb.service.*;
import beautiful.back.bb.service.impl.tools;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("sm")
public class smControllor {
    @Autowired
    StudentsService studentsService;
    @Autowired
    UserService userService;
    @Autowired
    RecordService recordService;
    @Autowired
    AttendService attendService;
    @Autowired
    CourseService courseService;
    @Autowired
    ClassService classService;
    /**
     *学生使用密码登录
     * @param sno
     * @param password
     * @return uuid
     */
    @RequestMapping("login")
    Object login(String sno,String password,String wxid){
        JSONObject jsonObject=new JSONObject();
        String sid = studentsService.judgePassword(sno,password,wxid);
        if(sid.equals("密码不对")) return sid;
        String token = userService.getToken(userService.findStudentByID(sid));
        jsonObject.put("sid",sid);
        jsonObject.put("token",token);
        return jsonObject;
    }

    /**
     * 学生使用微信登录
     * @param wechatId
     * @return
     */
    @RequestMapping("welogin")
    Object welogin(String wechatId){
        JSONObject jsonObject=new JSONObject();
        String sid = studentsService.judgeWxid(wechatId);
        if(sid.equals("密码不对")) return sid;
        String token = userService.getToken(userService.findStudentByID(sid));
        jsonObject.put("sid",sid);
        jsonObject.put("token",token);
        return jsonObject;
    }

    /**
     * 学生注册
     * @param sNum
     * @param majorId
     * @param name
     * @param img
     * @param password
     * @return
     */
    //未测试
    @RequestMapping("register")
    String register(String sNum,String majorId,String name, String img, String password){
        String sid = tools.getUUID();
        Students student = new Students();
        student.setSno(sNum);
        student.setMno(majorId);
        student.setSname(name);
        student.setImgpath(img);
        student.setPassword(password);
        student.setUuid(sid);
        if (studentsService.addStudent(student))
        return sid;
        return "注册失败";
    }

    /**
     * 返回此学生的个人信息
     * @param sid
     * @return
     */
    //未测试
    @UserLoginToken
    @RequestMapping("info")
    Students Info(String sid){
        return studentsService.getStudentInfo(sid);
    }

    /**
     * 查找该学生参加的课程
     * @param sid
     * @return
     */
    //未测试
    @UserLoginToken
    @RequestMapping("course")
    List<Course> course(String sid){
        List<Course> courseList = new ArrayList<>();
        for (String i : classService.findAllClnoBySno(studentsService.getStudentInfo(sid).getSno())){
            courseList.add(courseService.findAllCourseByclno(i));
        }
        return courseList;
    }

    /**
     * 检测一个学号是否存在
     * @param sNum
     * @return
     */
    //未测试
    @UserLoginToken
    @RequestMapping("numfind")
    boolean numFind(String sNum){
        return studentsService.ifStudent(sNum);
    }

    /**
     * 删除学生信息
     * @param sid
     * @return
     */
    //未测试
    @UserLoginToken
    @RequestMapping("remove")
    String remove(String sid){
        if(studentsService.delStudent(sid))
            return sid;
        return "删除失败";
    }

    /**
     * 查找该学生所有的考勤
     * @param sid
     * @return
     */
    //未测试
    @UserLoginToken
    @RequestMapping("attend")
    List<Map<Attend,Record>> attend(String sid){
        //获取学生学号
        String sno = studentsService.getStudentInfo(sid).getSno();
        List<Record> records = recordService.findAllRecordBySno(sno);
        List<Map<Attend,Record>> reslist= new ArrayList();
        for (Record i : records){
            Map<Attend,Record> res = new HashMap<>();
            res.put(attendService.findAttendByAtno(i.getAtno()),i);
            reslist.add(res);
        }
        return reslist;
    }
}
