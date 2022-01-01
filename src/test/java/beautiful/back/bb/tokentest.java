package beautiful.back.bb;

import beautiful.back.bb.service.UserService;
import beautiful.back.bb.service.impl.tools;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class tokentest {
    public static void main(String[] args)
    {
//        System.out.println(tools.getUUID());
        Date date = new Date();
        System.out.println(tools.dateToStamp(date));
    }
}
