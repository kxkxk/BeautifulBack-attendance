package beautiful.back.bb.service.impl;
import beautiful.back.bb.entry.User;
import com.auth0.jwt.JWT;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
public class tools {
    /**
     * 获得指定数目的UUID
     * @param number int 需要获得的UUID数量
     * @return String[] UUID数组
     */
    public static String[] getUUID(int number){
        if(number < 1){
            return null;
        }
        String[] retArray = new String[number];
        for(int i=0;i<number;i++){
            retArray[i] = getUUID();
        }
        return retArray;
    }
    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }

    /**
     * 解码token获得用户类型
     * @param token
     * @return
     */
    public static String decodeToken(String token){
        String userType =  JWT.decode(token).getClaim("type").asString();
        return userType;
    }

    public static boolean isAdmin(String token){
        return decodeToken(token).equals("Admin");
    }
    public static boolean isTeacher(String token){
        return decodeToken(token).equals("Teacher");
    }
    public static boolean isStudent(String token){
        return decodeToken(token).equals("Student");
    }


}
