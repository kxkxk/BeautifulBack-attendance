package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Students;

public interface StudentsMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Students record);

    int insertSelective(Students record);

    Students selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Students record);

    int updateByPrimaryKey(Students record);
}