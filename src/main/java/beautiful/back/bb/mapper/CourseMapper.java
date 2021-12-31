package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Course
*/
@Mapper
public interface CourseMapper {
    /**
     * 新建课程
     * @param course
     * @return List<Course>
     */
    int insertCourse(Course course);

    /**
     * 查找所有课程
     * @return List<Course>
     */
    List<Course> selectAll();

    /**
     * 查找教师名下所有课程
     * @param tno
     * @return List<Course>
     */
    List<Course> selectCourseByTeacher(String tno);

    /**
     * 修改课程名
     * @param cno
     * @param cname
     * @return int
     */
    int updateCnameByCno(String cno, String cname);

    /**
     * 修改课程备注
     * @param cno
     * @param cinfo
     * @return int
     */
    int updateCinfoByCno(String cno, String cinfo);

    /**
     * 删除课程
     * @param cno
     * @return int
     */
    int delCourseByCno(String cno);

    List<String> selectCnoByClno(String clno);

    Course selectCoursesByClno(String clno);
    String selectClnoByCno(String cno);
    Course selectCourseByCno(String cno);
    int updateCourse(Course course);
}
