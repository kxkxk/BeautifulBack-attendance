package beautiful.back.bb.mapper;

import beautiful.back.bb.entry.Attend;

import java.util.List;

/**
* @Entity ..beautiful.back.bb.entry.Attend
*/
public interface AttendMapper{
    /**
     * 新建考勤
     * @param attend
     * @return int
     */
    int insertAttend(Attend attend);

    /**
     * 修改考勤状态
     * @param atno
     * @param status
     * @return int
     */
    int updateStatusByAtno(String atno,int status);

    /**
     * 添加备注
     * @param atno
     * @param remarks
     * @return int
     */
    int updateRemarksByAtnoInt(String atno,String remarks);

    /**
     * 删除考勤
     * @param atno
     * @return int
     */
    int delAttendByAtno(String atno);

    /**
     * 查找所有考勤
     * @return List<Attend>
     */
    List<Attend> selectAll();

    /**
     * 查找某课程正在进行中的考勤
     * @return List<Attend>
     */
    List<Attend> selectRunningAttend();

    /**
     * 查找某教师名下考勤
     * @param tno
     * @return List<Attend>
     */
    List<Attend> selectAttendByTno(String tno);

    /**
     * 查找某课程全部考勤
     * @param cno
     * @return List<Attend>
     */
    List<Attend> selectAttendByCno(String cno);
}
