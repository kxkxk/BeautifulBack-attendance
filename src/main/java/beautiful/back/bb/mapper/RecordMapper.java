package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Record;

public interface RecordMapper {
    int deleteByPrimaryKey(String ano);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(String ano);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}