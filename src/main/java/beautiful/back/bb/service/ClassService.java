package beautiful.back.bb.service;

import beautiful.back.bb.entry.Class;

import java.util.List;


/**
*
*/
public interface ClassService{
    List<String> findAllClnoBySno(String sno);
    int getAllStudentsByClno(String clno);
    List<String> findSnoByClno(String clno);
    boolean addStudent(Class c);
    boolean delStudentsByClno(String clno);
}
