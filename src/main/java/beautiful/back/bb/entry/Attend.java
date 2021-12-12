package beautiful.back.bb.entry;


import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName attend
 */
public class Attend implements Serializable {
    /**
     * 
     */
    private String atno;

    /**
     * 
     */
    private String cno;

    /**
     * 
     */
    private String tno;

    /**
     * 
     */
    private String remarks;

    /**
     * 
     */
    private Integer status;

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
    public String getRemarks() {
        return remarks;
    }

    /**
     * 
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
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
        Attend other = (Attend) that;
        return (this.getAtno() == null ? other.getAtno() == null : this.getAtno().equals(other.getAtno()))
            && (this.getCno() == null ? other.getCno() == null : this.getCno().equals(other.getCno()))
            && (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStartdate() == null ? other.getStartdate() == null : this.getStartdate().equals(other.getStartdate()))
            && (this.getEnddate() == null ? other.getEnddate() == null : this.getEnddate().equals(other.getEnddate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAtno() == null) ? 0 : getAtno().hashCode());
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", atno=").append(atno);
        sb.append(", cno=").append(cno);
        sb.append(", tno=").append(tno);
        sb.append(", remarks=").append(remarks);
        sb.append(", status=").append(status);
        sb.append(", startdate=").append(startdate);
        sb.append(", enddate=").append(enddate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}