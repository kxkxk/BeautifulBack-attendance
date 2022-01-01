package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Record;
import beautiful.back.bb.mapper.RecordMapper;
import beautiful.back.bb.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
*
*/
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordMapper recordMapper;
    @Override
    public List<Record> findAllRecordBySno(String sno) {
        return recordMapper.selectRecordBySno(sno);
    }

    @Override
    public boolean addRecord(Record record) {
        try {
            recordMapper.insertRecord(record);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public int findStudentCountByAtnoAndType(String atno, int type) {
        return recordMapper.selectCountByTypeAndAtno(atno,type);

    }

    @Override
    public boolean changeStatuByAtnoAndSno(String atno, String sno, int type, Date date) {
        try {
            recordMapper.updateRecordByAtnoAndSno(atno,sno,type,date);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<Record> findRecordByAtno(String atno) {
        return recordMapper.selectRecordByAtno(atno);
    }
}
