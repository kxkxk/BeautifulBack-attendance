package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Admins;

import java.util.List;

/**
* @Entity ..beautiful.back.bb.entry.Admins
*/
public interface AdminsMapper {
    /**
     * 新建管理员
     * @param ano
     * @param aname
     * @param password
     * @return int
     */
    int insertAdmin(String ano,String aname,String password);

    /**
     * 更新密码
     * @param ano
     * @param password
     * @return int
     */
    int updatePas(String ano,String password);

    /**
     * 删除管理员
     * @param ano
     * @return int
     */
    int deleteAdmin(String ano);

    /**
     * 查找所有管理员信息
     * @return List<Admins>
     */
    List<Admins> selectAllInfo();

    /**
     * 查找单个管理员
     * @param ano
     * @return List<Admins>
     */
    List<Admins> selectAdminByAno(String ano);

    /**
     * 查找所有管理员
     * @return List<Admins>
     */
    List<Admins> selectAll();
}
