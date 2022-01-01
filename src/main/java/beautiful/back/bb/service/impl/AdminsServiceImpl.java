package beautiful.back.bb.service.impl;

import beautiful.back.bb.entry.Admins;
import beautiful.back.bb.mapper.AdminsMapper;
import beautiful.back.bb.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class AdminsServiceImpl implements AdminsService{
    @Autowired
    AdminsMapper adminsMapper;

    @Override
    public boolean judgePassword(String aname, String password) {
        if(!(adminsMapper.selectAdminByAno(aname)==null)||adminsMapper.selectAdminByAno(aname).getPassword().equals(password))
            return true;
        return false;
    }
}
