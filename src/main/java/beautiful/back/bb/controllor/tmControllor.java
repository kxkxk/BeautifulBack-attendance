package beautiful.back.bb.controllor;

import beautiful.back.bb.service.TeachersService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tm")
public class tmControllor {
    @Autowired
    TeachersService teachersService;
    @RequestMapping("login")
    Object login(String tNum,String password){
        JSONObject jsonObject=new JSONObject();

    }
}
