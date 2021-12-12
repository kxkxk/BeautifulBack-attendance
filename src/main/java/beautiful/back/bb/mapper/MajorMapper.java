package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Major;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Major
*/
public interface MajorMapper {
    //查找所有专业信息major
    List<Major> getAllMajor();
    //修改专业信息
    int updateMnameByMnoInt(String mno,String newMname);
}
