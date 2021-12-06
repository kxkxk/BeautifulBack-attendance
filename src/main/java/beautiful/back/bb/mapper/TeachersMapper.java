package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Teachers;

public interface TeachersMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Teachers record);

    int insertSelective(Teachers record);

    Teachers selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Teachers record);

    int updateByPrimaryKey(Teachers record);
}