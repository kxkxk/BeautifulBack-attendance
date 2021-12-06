package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Admins;

public interface AdminsMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Admins record);

    int insertSelective(Admins record);

    Admins selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Admins record);

    int updateByPrimaryKey(Admins record);
}