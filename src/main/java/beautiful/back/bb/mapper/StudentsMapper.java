package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Students;

import java.util.List;

/**
* @Entity ..beautiful.back.bb.entry.Students
*/
public interface StudentsMapper{
    /**
     * 新建学生
     * @param student
     * @return
     */
    int insertStudent(Students student);

    /**
     * 修改密码
     * @param sno
     * @param password
     * @return int
     */
    int updataPasswordBySno(String sno,String password);

    /**
     * 修改名称
     * @param sno
     * @param sname
     * @return int
     */
    int updataNameBySno(String sno,String sname);

    /**
     * 更新照片路径
     * @param sno
     * @param imgpath
     * @return int
     */
    int updataImgpathBySno(String sno,String imgpath);

    /**
     * 改班级
     * @param sno
     * @param clno
     * @return int
     */
    int updataClnoBySno(String sno,String clno);

    /**
     * 改专业
     * @param sno
     * @param mno
     * @return int
     */
    int updataMnoBySno(String sno,String mno);
    /**
     * 删除学生
     * @param sno
     * @return int
     */
    int delStudentBySno(String sno);

    /**
     * 查找所有学生
     * @return List<Students>
     */
    List<Students> selectAll();

    /**
     * 查找同一班级的学生
     * @param cno
     * @return List<Students>
     */
    List<Students> selectStudentByClno(String cno);

    /**
     * 查找同一专业的学生
     * @param mno
     * @return List<Students>
     */
    List<Students> selectStudentsByMno(String mno);

    /**
     * 查找某个学生
     * @param sno
     * @return Students
     */
    Students selectStudentBySno(String sno);

    /**
     * 查找某个学生的照片路径
     * @param sno
     * @return String
     */
    String selectImgpathBySno(String sno);

    /**
     * 通过学生姓名模糊搜索学生
     * @param sname
     * @return List<Students>
     */
    List<Students> selectStundentsBySname(String sname);
}
