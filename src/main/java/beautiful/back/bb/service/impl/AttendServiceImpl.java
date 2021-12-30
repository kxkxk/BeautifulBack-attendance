package beautiful.back.bb.service.impl;
import beautiful.back.bb.entry.Attend;
import beautiful.back.bb.mapper.AttendMapper;
import beautiful.back.bb.service.AttendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
