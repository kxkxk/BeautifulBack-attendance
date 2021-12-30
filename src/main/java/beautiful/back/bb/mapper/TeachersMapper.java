package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Teachers;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @Entity ..beautiful.back.bb.entry.Teachers
*/
@Mapper
public interface TeachersMapper {

    /**
     * 查找所有教师信息
     * @return List<Teachers>
     */
    List<Teachers> selectAll();

    /**
     * 根据教师号查找教师
     * @param tno
     * @return Teachers
     */
    Teachers selectTeacherByTno(String tno);

    /**
     * 根据专业查找教师
     * @param mno
     * @return List<Teachers>
     */
    List<Teachers> selectTeachersByMno(String mno);

    /**
     * 教师注册
     * @param teacher
     * @return int
     */
    int insertTeacher(Teachers teacher);

    /**
     * 密码修改
     * @param tno
     * @param password
     * @return
     */
    int updatePasswordByTno(String tno,String password);

    /**
     * 教师名修改
     * @param tno
     * @param tname
     * @return
     */
    int updateTnameByTno(String tno,String tname);
    /**
     * 通过教师号删除教师
     * @param tno
     * @return int
     */
    int delByTnoInt(String tno);

    /**
     * 获得uuid
     * @param tno
     * @return String
     */
    String getuuid(String tno);
    /**
     *
     */
    String getTnoByUuid(String uuid);

    /**
     * 通过uuid查找teacher
     * @param uuid
     * @return Teachers
     */
    Teachers selectTeacherByUuid(String uuid);
}
