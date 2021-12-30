package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Admins;
import beautiful.back.bb.entry.Students;
import beautiful.back.bb.entry.Teachers;
import beautiful.back.bb.entry.User;
import beautiful.back.bb.mapper.AdminsMapper;
import beautiful.back.bb.mapper.StudentsMapper;
import beautiful.back.bb.mapper.TeachersMapper;
import beautiful.back.bb.service.UserService;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    AdminsMapper adminsMapper;
    @Autowired
    TeachersMapper teachersMapper;
    @Autowired
    StudentsMapper studentsMapper;
    @Override
    public User findAdminByID(String ID) {
        Admins admins = adminsMapper.selectAdminByAno(ID);
        return new User(admins.getAno(),"Admin",admins.getAname());
    }

    @Override
    public User findTeacherByID(String ID) {
        Teachers teachers = teachersMapper.selectTeacherByUuid(ID);
        return new User(teachers.getUuid(),"Teacher",teachers.getPassword());
    }

    @Override
    public User findStudentByID(String ID) {
        Students students = studentsMapper.selectStudentByUuid(ID);
        return new User(students.getUuid(),"Student",students.getPassword());
    }
    /**
     * 获取token
     * @param user
     * @return
     */
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getId())
                .withClaim("type",user.getType())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
