package beautiful.back.bb.controllor;

import beautiful.back.bb.annotation.UserLoginToken;
import beautiful.back.bb.entry.Major;
import beautiful.back.bb.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//全部未测试
@RestController
@RequestMapping("ds")
public class dsControllor {
    @Autowired
    MajorService majorService;

    /**
     * 返回所有的专业id和名字
     * @return
     */
    @UserLoginToken
    @RequestMapping("majorId")
    List<Major> majorId(){
        return majorService.findAllMajor();
    }
}
