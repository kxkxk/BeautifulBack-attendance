package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Major;

import beautiful.back.bb.mapper.MajorMapper;
import beautiful.back.bb.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorMapper majorMapper;
    @Override
    public List<Major> findAllMajor() {
        return majorMapper.getAllMajor();
    }
}
