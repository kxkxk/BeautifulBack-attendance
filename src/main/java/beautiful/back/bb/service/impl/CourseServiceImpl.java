package beautiful.back.bb.service.impl;
import beautiful.back.bb.entry.Course;
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

    @Override
    public List<String> findCnoByClnos(String clno) {
        return courseMapper.selectCnoByClno(clno);
    }

    @Override
    public Course findAllCourseByclno(String clno) {
        return courseMapper.selectCoursesByClno(clno);
    }
}
