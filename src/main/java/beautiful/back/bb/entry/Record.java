package beautiful.back.bb.entry;


import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName record
 */
public class Record implements Serializable {
    /**
     * 
     */
    private Integer rno;

    /**
     * 
     */
    private String atno;

    /**
     * 
     */
    private String sno;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private Integer type;

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param rno
     * @param atno
     * @param sno
     * @param date
     * @param type
     */
    public Record(Integer rno, String atno, String sno, Date date, Integer type) {
        this.rno = rno;
        this.atno = atno;
        this.sno = sno;
        this.date = date;
        this.type = type;
    }

    /**
     * 
     */
    public Integer getRno() {
        return rno;
    }

    /**
     * 
     */
    public void setRno(Integer rno) {
        this.rno = rno;
    }

    /**
     * 
     */
    public String getAtno() {
        return atno;
    }

    /**
     * 
     */
    public void setAtno(String atno) {
        this.atno = atno;
    }

    /**
     * 
     */
    public String getSno() {
        return sno;
    }

    /**
     * 
     */
    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * 
     */
    public Date getDate() {
        return date;
    }

    /**
     * 
     */
    public void setDate(Date date) {
        this.date = date;
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
        Record other = (Record) that;
        return (this.getRno() == null ? other.getRno() == null : this.getRno().equals(other.getRno()))
            && (this.getAtno() == null ? other.getAtno() == null : this.getAtno().equals(other.getAtno()))
            && (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRno() == null) ? 0 : getRno().hashCode());
        result = prime * result + ((getAtno() == null) ? 0 : getAtno().hashCode());
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rno=").append(rno);
        sb.append(", atno=").append(atno);
        sb.append(", sno=").append(sno);
        sb.append(", date=").append(date);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}