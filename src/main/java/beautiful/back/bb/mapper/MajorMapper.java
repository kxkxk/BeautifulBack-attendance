package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Major;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Major
*/
public interface MajorMapper {
    /**
     * 新建专业
     * @param major
     * @return int
     */
    int insertMajor(Major major);

    /**
     * 删除专业
     * @param mno
     * @return int 
     */
    int deleteByMno(String mno);
    /**
     * 查找所有专业信息major
     * @return List<Major>
     */
    List<Major> getAllMajor();

    /**
     * 修改专业信息
     * @param mno
     * @param newMname
     * @return List<Major>
     */
    int updateMnameByMnoInt(String mno,String newMname);
}
