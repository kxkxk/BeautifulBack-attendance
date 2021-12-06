package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}