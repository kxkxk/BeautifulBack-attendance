package beautiful.back.bb.service;

import beautiful.back.bb.entry.User;

public interface UserService {
    User findAdminByID(String ID);
    User findTeacherByID(String ID);
    User findStudentByID(String ID);
    public String getToken(User user);
}
