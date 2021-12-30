package beautiful.back.bb.service;


import beautiful.back.bb.entry.Teachers;

/**
*
*/
public interface TeachersService{
    //账号密码判断
    String judgePassword(String tno,String password);
    //注册账号
    boolean register(Teachers teachers);
    //查看教师是否存在
    boolean isTeacherExist(String tno);
    //删除教师
    boolean delTeacher(String tid);
}
