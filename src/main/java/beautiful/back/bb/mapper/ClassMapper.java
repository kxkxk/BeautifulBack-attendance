package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Class
*/
@Mapper
public interface ClassMapper {

    /**
     * 添加学生
     * @param cla
     * @return int
     */
    int insertStudent(Class cla);

    /**
     * 删除班级
     * @param clno
     * @return int
     */
    int deleteClassByClno(String clno);

    /**
     * 删除学生
     * @param sno
     * @param clno
     * @return
     */
    int deleteStudentBySnoAndClno(String sno,String clno);

    /**
     * 查找某课程的学生
     * @param clno
     * @return
     */
    List<String> selectStudentsByClno(String clno);

    List<String> selectClnoBySno(String sno);
    int selectStudentCount(String clno);

}
