package beautiful.back.bb.entry;


import com.alibaba.druid.support.monitor.annotation.MTable;

import java.io.Serializable;

/**
 * 
 * @TableName major
 */
public class Major implements Serializable {
    /**
     * 
     */
    private String mno;

    /**
     * 
     */
    private String mname;

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param mno
     * @param mname
     */
    public Major(String mno, String mname) {
        this.mno = mno;
        this.mname = mname;
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
    public String getMname() {
        return mname;
    }

    /**
     * 
     */
    public void setMname(String mname) {
        this.mname = mname;
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
        Major other = (Major) that;
        return (this.getMno() == null ? other.getMno() == null : this.getMno().equals(other.getMno()))
            && (this.getMname() == null ? other.getMname() == null : this.getMname().equals(other.getMname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMno() == null) ? 0 : getMno().hashCode());
        result = prime * result + ((getMname() == null) ? 0 : getMname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mno=").append(mno);
        sb.append(", mname=").append(mname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}