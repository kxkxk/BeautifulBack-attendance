package beautiful.back.bb.service;

import beautiful.back.bb.entry.Record;

import java.util.List;


/**
*
*/
public interface RecordService{
        List<Record> findAllRecordBySno(String sno);
}
