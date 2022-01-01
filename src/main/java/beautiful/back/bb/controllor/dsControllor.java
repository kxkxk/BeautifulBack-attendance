package beautiful.back.bb.controllor;

import beautiful.back.bb.annotation.UserLoginToken;
import beautiful.back.bb.entry.Major;
import beautiful.back.bb.entry.User;
import beautiful.back.bb.service.AdminsService;
import beautiful.back.bb.service.MajorService;
import beautiful.back.bb.service.UserService;
import beautiful.back.bb.service.impl.tools;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
@RequestMapping("ds")
public class dsControllor {
    @Autowired
    MajorService majorService;
    @Autowired
    AdminsService adminsService;
    @Autowired
    UserService userService;

    /**
     * 返回所有的专业id和名字
     * @return
     */
    @UserLoginToken
    @RequestMapping("majorid")
    List<Major> majorId(){
        return majorService.findAllMajor();
    }

    @UserLoginToken
    @RequestMapping("new")
    String createMajor(String name, HttpServletRequest httpServletRequest){
        String token = httpServletRequest.getHeader("token");
        if(!tools.isAdmin(token)) return "权限不足";
        String mno = tools.getUUID();
        if(majorService.addMajor(new Major(mno,name))){
            return mno;
        }
        return "插入失败";
    }
    @UserLoginToken
    @RequestMapping("remove")
    String remove(String mno,HttpServletRequest httpServletRequest){
        String token = httpServletRequest.getHeader("token");
        if(!tools.isAdmin(token)) return "权限不足";
        if(majorService.delMajor(mno)) return mno;
        return "删除失败";
    }
    @RequestMapping("login")
    Object login(String aNum,String password){
        JSONObject jsonObject = new JSONObject();
        if(adminsService.judgePassword(aNum,password)){
            User user = new User(aNum,"Admin",password);
            String token = userService.getToken(user);
            jsonObject.put("token",token);
            jsonObject.put("aid",aNum);
            return jsonObject;
        }
        return "登录失败";
    }
}
