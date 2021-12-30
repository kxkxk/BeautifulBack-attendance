package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Record;
import beautiful.back.bb.mapper.RecordMapper;
import beautiful.back.bb.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
