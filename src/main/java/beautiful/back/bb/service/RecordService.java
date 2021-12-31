package beautiful.back.bb.service;

import beautiful.back.bb.entry.Record;

import java.util.Date;
import java.util.List;


/**
*
*/
public interface RecordService{
        List<Record> findAllRecordBySno(String sno);
        boolean addRecord(Record record);
        int findStudentCountByAtnoAndType(String atno,int type);
        boolean changeStatuByAtnoAndSno(String atno, String sno, int type, Date date);
        List<Record> findRecordByAtno(String atno);
}
