package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Students;

import beautiful.back.bb.mapper.StudentsMapper;
import beautiful.back.bb.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    StudentsMapper studentsMapper;
    @Override
    public boolean addStudent(Students students) {
        try {
            studentsMapper.insertStudent(students);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public String judgeWxid(String wxid) {
        String uuid = studentsMapper.selectUuidByWxid(wxid);
        if(uuid != null) return uuid;
        return "未绑定";
    }

    @Override
    public String judgePassword(String sno, String password, String wxid) {
//        Students stu = studentsMapper.selectStudentBySno(sno);
        String pas = studentsMapper.selectPasswordBySno(sno);
        if(pas == null) return "账号错误";
        if(!pas.isEmpty()&&pas.equals(password)){
            //更新微信id方便微信登录
            try{
                studentsMapper.updateWxid(sno,wxid);
            }catch (Exception e){
                return "微信号已存在";
            }
            return studentsMapper.selectUuidBySno(sno);
        }
        return "密码不对";
    }

    @Override
    public boolean updateStudent(Students students) {
        try {
            studentsMapper.updateStudentInfo(students);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public Students getStudentInfo(String uuid) {
        Students stu = studentsMapper.selectStudentByUuid(uuid);
        stu.setPassword(null);
        return stu;
    }

    @Override
    public boolean isStudent(String sno) {
        if(!studentsMapper.selectUuidBySno(sno).isEmpty())
            return true;
        return false;
    }

    @Override
    public boolean delStudent(String uuid) {
        try {
            studentsMapper.delStudentByUuid(uuid);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public Students getStudentInfoBySno(String sno) {
        return studentsMapper.selectStudentBySno(sno);
    }

}
