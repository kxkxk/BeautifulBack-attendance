package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Class;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Class
*/
public interface ClassMapper {
    /**
     * 查询所有班级
     * @return List<Class>
     */
    List<Class> selectAll();

    /**
     * 根据班级号查询班级
     * @param clno
     * @return Class
     */
    Class selectClassByClno(String clno);

    /**
     * 根据教师号查询班级
     * @param tno
     * @return List<Class>
     */
    List<Class> selectClassByTno(String tno);

    /**
     * 根据专业号查询班级
     * @param mno
     * @return List<Class>
     */
    List<Class> selectClassByMno(String mno);

    /**
     * 创建班级
     * @param cla
     * @return int
     */
    int insertClass(Class cla);

    /**
     * 删除班级
     * @param clno
     * @return int
     */
    int deleteClassByClno(String clno);

    /**
     * 修改班级教师信息
     * @param clno
     * @param tno
     * @return int
     */
    int updataTnoByClno(String clno, String tno);

    /**
     * 修改班级专业信息
     * @param clno
     * @param mno
     * @return int
     */
    int updataMnoByClno(String clno,String mno);

}
