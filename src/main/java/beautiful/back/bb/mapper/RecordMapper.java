package beautiful.back.bb.mapper;
import beautiful.back.bb.entry.Record;

import java.util.List;


/**
* @Entity ..beautiful.back.bb.entry.Record
*/
public interface RecordMapper {

    /**
     * 新建记录
     * @param record
     * @return int
     */
    int insertRecord(Record record);

    /**
     * 查找所有记录
     * @return List<Record>
     */
    List<Record> selectAll();

    /**
     * 查找某学生所有记录
     * @param sno
     * @return List<Record>
     */
    List<Record> selectRecordBySno(String sno);

    /**
     * 查找某次考勤所有记录
     * @param atno
     * @return List<Record>
     */
    List<Record> selectRecordByAtno(String atno);

    /**
     * 修改某记录状态
     * @param atno
     * @param sno
     * @param type
     * @return int
     */
    int updateTypeByAtnoAndSnoInt(String atno,String sno,int type);

    /**
     * 删除某考勤所有记录
     * @param atno
     * @return int
     */
    int delRecordByAtno(String atno);
}
