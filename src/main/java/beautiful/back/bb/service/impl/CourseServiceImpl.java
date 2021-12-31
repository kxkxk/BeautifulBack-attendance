package beautiful.back.bb.service.impl;
import beautiful.back.bb.entry.Course;
import beautiful.back.bb.mapper.ClassMapper;
import beautiful.back.bb.mapper.CourseMapper;
import beautiful.back.bb.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    ClassMapper classMapper;
    @Override
    public List<String> findCnoByClnos(String clno) {
        return courseMapper.selectCnoByClno(clno);
    }

    @Override
    public Course findAllCourseByclno(String clno) {
        return courseMapper.selectCoursesByClno(clno);
    }

    @Override
    public boolean addCourse(Course course) {
        return courseMapper.insertCourse(course)>0;
    }

    @Override
    public String findClnoByCno(String cno) {
        return courseMapper.selectClnoByCno(cno);
    }

    @Override
    public Course findCourseByCno(String cno) {
        return courseMapper.selectCourseByCno(cno);
    }

    @Override
    public boolean changeCourse(Course course) {
        return courseMapper.updateCourse(course)>0;
    }

    @Override
    public boolean removeCourseByCid(String cid) {
        String clno = courseMapper.selectClnoByCno(cid);
        try {
            classMapper.deleteClassByClno(clno);
            courseMapper.delCourseByCno(cid);
        }catch (Exception e){
            return false;
        }
        return true;
    }


}
