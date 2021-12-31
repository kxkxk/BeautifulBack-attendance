package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Class;
import beautiful.back.bb.mapper.ClassMapper;
import beautiful.back.bb.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classMapper;

    @Override
    public List<String> findAllClnoBySno(String sno) {
        return classMapper.selectClnoBySno(sno);
    }

    @Override
    public int getAllStudentsByClno(String clno) {
        return classMapper.selectStudentCount(clno);
    }

    @Override
    public List<String> findSnoByClno(String clno) {
        return classMapper.selectStudentsByClno(clno);
    }

    @Override
    public boolean addStudent(Class c) {
        return classMapper.insertStudent(c)>0;
    }

    @Override
    public boolean delStudentsByClno(String clno) {
        return classMapper.deleteClassByClno(clno)>0;
    }
}
