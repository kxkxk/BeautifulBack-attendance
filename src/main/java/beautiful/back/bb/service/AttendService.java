package beautiful.back.bb.service;


import beautiful.back.bb.entry.Attend;

import java.util.List;

/**
*
*/
public interface AttendService {
    Attend findAttendByAtno(String atno);
    boolean addAttend(Attend attend);
    boolean updateAttend(Attend attend);
    boolean delAttend(String atno);
    boolean cancelAttend(String atno);
    List<Attend> findAttendByCno(String cno);
}
