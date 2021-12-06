package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}