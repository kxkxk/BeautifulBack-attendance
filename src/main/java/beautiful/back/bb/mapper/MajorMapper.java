package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Major;

public interface MajorMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}