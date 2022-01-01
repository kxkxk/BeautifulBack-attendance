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
        try{
            attendMapper.insertAttend(attend);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean updateAttend(Attend attend) {
        try {
            attendMapper.updateAttendByAtno(attend);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean delAttend(String atno) {
        try {
            attendMapper.delAttendByAtno(atno);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean cancelAttend(String atno) {
        try {
            attendMapper.updateStatusByAtno(atno,4);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<Attend> findAttendByCno(String cno) {
        return attendMapper.selectAttendByCno(cno);
    }
}
