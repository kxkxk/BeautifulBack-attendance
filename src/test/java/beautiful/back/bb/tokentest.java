package beautiful.back.bb;

import beautiful.back.bb.service.UserService;
import beautiful.back.bb.service.impl.tools;
import org.springframework.beans.factory.annotation.Autowired;

public class tokentest {
    public static void main(String[] args) {
        System.out.println(tools.getUUID());
    }
}
