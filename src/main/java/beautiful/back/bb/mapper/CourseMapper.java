package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Course;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Course
*/
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
     * 查找班级名下所有课程
     * @param clno
     * @return List<Course>
     */
    List<Course> selectCourseByClno(String clno);

    /**
     * 查找某段时间内的课程
     * @param start
     * @param end
     * @return List<Course>
     */
    List<Course> selectCourseByDate(String start,String end);

    /**
     * 查询大于某个时间的课程
     * @param date
     * @return List<Course>
     */
    List<Course> selectCourseDateBig(String date);

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
}
