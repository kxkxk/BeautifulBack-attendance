package beautiful.back.bb.entry;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @TableName course
 */

public class Course implements Serializable {
    /**
     *
     */
    private String cno;

    /**
     *
     */
    private String cname;

    /**
     *
     */
    private String tno;

    /**
     *
     */
    private Integer type;

    /**
     *
     */
    private String info;

    /**
     *
     */
    private String clno;

    /**
     *
     */
    private Date startdate;

    /**
     *
     */
    private Date enddate;

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param cno
     * @param cname
     * @param tno
     * @param type
     * @param info
     * @param clno
     * @param startdate
     * @param enddate
     */
    public Course(String cno, String cname, String tno, Integer type, String info, String clno, Date startdate, Date enddate) {
        this.cno = cno;
        this.cname = cname;
        this.tno = tno;
        this.type = type;
        this.info = info;
        this.clno = clno;
        this.startdate = startdate;
        this.enddate = enddate;
    }


    /**
     *
     */
    public String getCno() {
        return cno;
    }

    /**
     *
     */
    public void setCno(String cno) {
        this.cno = cno;
    }

    /**
     *
     */
    public String getCname() {
        return cname;
    }

    /**
     *
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     *
     */
    public String getTno() {
        return tno;
    }

    /**
     *
     */
    public void setTno(String tno) {
        this.tno = tno;
    }

    /**
     *
     */
    public Integer getType() {
        return type;
    }

    /**
     *
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     *
     */
    public String getInfo() {
        return info;
    }

    /**
     *
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     *
     */
    public String getClno() {
        return clno;
    }

    /**
     *
     */
    public void setClno(String clno) {
        this.clno = clno;
    }

    /**
     *
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     *
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     *
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     *
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Course other = (Course) that;
        return (this.getCno() == null ? other.getCno() == null : this.getCno().equals(other.getCno()))
                && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
                && (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
                && (this.getClno() == null ? other.getClno() == null : this.getClno().equals(other.getClno()))
                && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
                && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getClno() == null) ? 0 : getClno().hashCode());
        result = prime * result + ((getStartdate() == null) ? 0 : getStartdate().hashCode());
        result = prime * result + ((getEnddate() == null) ? 0 : getEnddate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cno=").append(cno);
        sb.append(", cname=").append(cname);
        sb.append(", tno=").append(tno);
        sb.append(", type=").append(type);
        sb.append(", info=").append(info);
        sb.append(", clno=").append(clno);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}