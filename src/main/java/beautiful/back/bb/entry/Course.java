package beautiful.back.bb.entry;


import java.io.Serializable;

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
    private Integer cstatus;

    /**
     * 
     */
    private String cname;

    /**
     * 
     */
    private String teacher;

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

    private static final long serialVersionUID = 1L;

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
    public Integer getCstatus() {
        return cstatus;
    }

    /**
     * 
     */
    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
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
    public String getTeacher() {
        return teacher;
    }

    /**
     * 
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
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
            && (this.getCstatus() == null ? other.getCstatus() == null : this.getCstatus().equals(other.getCstatus()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getTeacher() == null ? other.getTeacher() == null : this.getTeacher().equals(other.getTeacher()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getInfo() == null ? other.getInfo() == null : this.getInfo().equals(other.getInfo()))
            && (this.getClno() == null ? other.getClno() == null : this.getClno().equals(other.getClno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCno() == null) ? 0 : getCno().hashCode());
        result = prime * result + ((getCstatus() == null) ? 0 : getCstatus().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getTeacher() == null) ? 0 : getTeacher().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getInfo() == null) ? 0 : getInfo().hashCode());
        result = prime * result + ((getClno() == null) ? 0 : getClno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cno=").append(cno);
        sb.append(", cstatus=").append(cstatus);
        sb.append(", cname=").append(cname);
        sb.append(", teacher=").append(teacher);
        sb.append(", type=").append(type);
        sb.append(", info=").append(info);
        sb.append(", clno=").append(clno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}