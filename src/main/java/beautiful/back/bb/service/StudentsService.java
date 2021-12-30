package beautiful.back.bb.service;

import beautiful.back.bb.entry.Course;
import beautiful.back.bb.entry.Students;

import java.util.List;


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
    String updateStudent(Students students);
    //查找学生信息
    Students getStudentInfo(String uuid);
    //判断一个学生是否存在
    boolean ifStudent(String sno);
    //删除学生
    boolean delStudent(String uuid);

}
