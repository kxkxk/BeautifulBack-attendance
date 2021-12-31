package beautiful.back.bb.service;

import beautiful.back.bb.entry.Students;


/**
*
*/
public interface StudentsService{
    //添加学生
    boolean addStudent(Students students);
    //微信判断
    String judgeWxid(String wxid);
    //账号密码判断
    String judgePassword(String sno,String password,String wxid);
    //更新学生信息
    boolean updateStudent(Students students);
    //查找学生信息
    Students getStudentInfo(String uuid);
    //判断一个学生是否存在
    boolean isStudent(String sno);
    //删除学生
    boolean delStudent(String uuid);
    //通过学号获得学生信息
    Students getStudentInfoBySno(String sno);

}
