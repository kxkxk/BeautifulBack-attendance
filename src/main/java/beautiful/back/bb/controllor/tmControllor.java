package beautiful.back.bb.controllor;

import beautiful.back.bb.annotation.UserLoginToken;
import beautiful.back.bb.entry.Teachers;
import beautiful.back.bb.service.TeachersService;
import beautiful.back.bb.service.UserService;
import beautiful.back.bb.service.impl.tools;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("tm")
public class tmControllor {
    @Autowired
    TeachersService teachersService;
    @Autowired
    UserService userService;

    /**
     * 教师登录
     * @param tNum
     * @param password
     * @return
     */
    @RequestMapping("login")
    Object login(String tNum,String password){
        JSONObject jsonObject=new JSONObject();
        String tid = teachersService.judgePassword(tNum,password);
        jsonObject.put("tid",tid);
        if(!tid.equals("密码错误")){
            jsonObject.put("token",userService.getToken(userService.findTeacherByID(tid)));
            return jsonObject;
        }
        return jsonObject;
    }

    /**
     * 教师注册
     * @param tNum
     * @param mno
     * @param password
     * @param name
     * @return
     */
    @RequestMapping("register")
    String register(String tNum,String mno,String password,String name){
        String uuid = tools.getUUID();
        Teachers teachers = new Teachers(tNum,name,mno,password, uuid);
        if (teachersService.register(teachers))
            return uuid;
        return "注册失败";
    }

    /**
     * 检测一个教师号是否存在
     * @param tNum
     * @return
     */
    @UserLoginToken
    @RequestMapping("numfind")
    boolean numFind(String tNum){
        return teachersService.isTeacherExist(tNum);
    }

    /**
     * 删除教师
     * @param tid token
     * @return
     */
    @UserLoginToken
    @RequestMapping("remove")
    String remove(String tid,String token){
        if(!tools.isAdmin(token))
            return "权限不足";
        else if(teachersService.delTeacher(tid))
            return tid;
        return "删除失败";
    }
}
