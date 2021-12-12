package beautiful.back.bb.entry;


import java.io.Serializable;

/**
 * 
 * @TableName class
 */
public class Class implements Serializable {
    /**
     * 
     */
    private String clno;

    /**
     * 
     */
    private String clname;

    /**
     * 
     */
    private String mno;

    /**
     * 
     */
    private String tno;

    private static final long serialVersionUID = 1L;

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
    public String getClname() {
        return clname;
    }

    /**
     * 
     */
    public void setClname(String clname) {
        this.clname = clname;
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
    public String getTno() {
        return tno;
    }

    /**
     * 
     */
    public void setTno(String tno) {
        this.tno = tno;
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
        Class other = (Class) that;
        return (this.getClno() == null ? other.getClno() == null : this.getClno().equals(other.getClno()))
            && (this.getClname() == null ? other.getClname() == null : this.getClname().equals(other.getClname()))
            && (this.getMno() == null ? other.getMno() == null : this.getMno().equals(other.getMno()))
            && (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClno() == null) ? 0 : getClno().hashCode());
        result = prime * result + ((getClname() == null) ? 0 : getClname().hashCode());
        result = prime * result + ((getMno() == null) ? 0 : getMno().hashCode());
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clno=").append(clno);
        sb.append(", clname=").append(clname);
        sb.append(", mno=").append(mno);
        sb.append(", tno=").append(tno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}