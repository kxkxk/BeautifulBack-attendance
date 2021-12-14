package beautiful.back.bb.entry;


import java.io.Serializable;

/**
 * 
 * @TableName teachers
 */
public class Teachers implements Serializable {
    /**
     * 
     */
    private String tno;

    /**
     * 
     */
    private String tname;

    /**
     * 
     */
    private String mno;

    /**
     * 
     */
    private String password;

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param tno
     * @param tname
     * @param mno
     * @param password
     */
    public Teachers(String tno, String tname, String mno, String password) {
        this.tno = tno;
        this.tname = tname;
        this.mno = mno;
        this.password = password;
    }

    /**
     *
     * @param tno
     * @param tname
     * @param mno
     */
    public Teachers(String tno, String tname, String mno) {
        this.tno = tno;
        this.tname = tname;
        this.mno = mno;
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
    public String getTname() {
        return tname;
    }

    /**
     * 
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * 
     */
    public String getMno() {
        return mno;
    }

    /**
     * 
     */
    public void setMno(String mno) {
        this.mno = mno;
    }

    /**
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     */
    public void setPassword(String password) {
        this.password = password;
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
        Teachers other = (Teachers) that;
        return (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()))
            && (this.getTname() == null ? other.getTname() == null : this.getTname().equals(other.getTname()))
            && (this.getMno() == null ? other.getMno() == null : this.getMno().equals(other.getMno()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getMno() == null) ? 0 : getMno().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tno=").append(tno);
        sb.append(", tname=").append(tname);
        sb.append(", mno=").append(mno);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}