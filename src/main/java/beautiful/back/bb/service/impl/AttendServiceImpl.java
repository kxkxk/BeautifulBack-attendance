package beautiful.back.bb.service.impl;
import beautiful.back.bb.entry.Attend;
import beautiful.back.bb.mapper.AttendMapper;
import beautiful.back.bb.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class AttendServiceImpl implements AttendService {
    @Autowired
    AttendMapper attendMapper;
    @Override
    public Attend findAttendByAtno(String atno) {
        return attendMapper.selectAttendByAtno(atno);
    }

    @Override
    public boolean addAttend(Attend attend) {
        return attendMapper.insertAttend(attend)>0;
    }

    @Override
    public boolean updateAttend(Attend attend) {
        return attendMapper.updateAttendByAtno(attend)>0;
    }

    @Override
    public boolean delAttend(String atno) {
        return attendMapper.delAttendByAtno(atno)>0;
    }

    @Override
    public boolean cancelAttend(String atno) {
        return attendMapper.updateStatusByAtno(atno,4)>0;
    }

    @Override
    public List<Attend> findAttendByCno(String cno) {
        return attendMapper.selectAttendByCno(cno);
    }
}
