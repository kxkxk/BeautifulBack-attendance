package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Attend;

public interface AttendMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Attend record);

    int insertSelective(Attend record);

    Attend selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Attend record);

    int updateByPrimaryKey(Attend record);
}