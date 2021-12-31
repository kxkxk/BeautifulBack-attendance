package beautiful.back.bb.service;

import beautiful.back.bb.entry.Course;

import java.util.List;


/**
*
*/
public interface CourseService{
    //查找cno
    List<String> findCnoByClnos(String clno);
    //通过clno查找课程
    Course findAllCourseByclno(String clno);
    //添加课程
    boolean addCourse(Course course);
    String findClnoByCno(String cno);
    Course findCourseByCno(String cno);
    boolean changeCourse(Course course);
    boolean removeCourseByCid(String cid);
}
