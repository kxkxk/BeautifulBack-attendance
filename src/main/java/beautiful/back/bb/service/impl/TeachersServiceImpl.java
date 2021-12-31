package beautiful.back.bb.service.impl;
import beautiful.back.bb.entry.Teachers;
import beautiful.back.bb.mapper.TeachersMapper;
import beautiful.back.bb.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class TeachersServiceImpl implements TeachersService {
    @Autowired
    TeachersMapper teachersMapper;
    @Override
    public String judgePassword(String tno, String password) {
        Teachers teacher = teachersMapper.selectTeacherByTno(tno);
        if(teacher.getPassword().equals(password))
            return teacher.getUuid();
        return "密码错误";
    }

    @Override
    public boolean register(Teachers teachers) {
        if(teachersMapper.insertTeacher(teachers)>0)
            return true;
        return false;
    }

    @Override
    public boolean isTeacherExist(String tno) {
        return !teachersMapper.selectUuidByTno(tno).isEmpty();
    }

    @Override
    public boolean delTeacher(String tid) {
        return teachersMapper.delByTnoInt(teachersMapper.getTnoByUuid(tid))>0;
    }

    @Override
    public String findTnoByUuid(String tid) {
        return teachersMapper.selectTeacherByUuid(tid).getTno();
    }

    @Override
    public Teachers findTeacherByUuid(String tid) {
        return teachersMapper.selectTeacherByUuid(tid);
    }

    @Override
    public Teachers findTeacherByTno(String tno) {
        return teachersMapper.selectTeacherByTno(tno);
    }
}
