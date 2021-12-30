package beautiful.back.bb.service.impl;

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
}
