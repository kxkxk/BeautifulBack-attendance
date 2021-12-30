package beautiful.back.bb.service;

import beautiful.back.bb.entry.Course;

import java.util.List;


/**
*
*/
public interface CourseService{
    List<String> findCnoByClnos(String clno);
    Course findAllCourseByclno(String clno);
}
