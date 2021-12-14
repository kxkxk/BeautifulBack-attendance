package beautiful.back.bb.entry;

import java.io.Serializable;

/**
 * 
 * @TableName students
 */
public class Students implements Serializable {
    /**
     * 
     */
    private String sno;

    /**
     * 
     */
    private String sname;

    /**
     * 
     */
    private String clno;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String imgpath;

    /**
     * 
     */
    private String mno;

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param sno
     * @param sname
     * @param clno
     * @param password
     * @param imgpath
     * @param mno
     */
    public Students(String sno, String sname, String clno, String password, String imgpath, String mno) {
        this.sno = sno;
        this.sname = sname;
        this.clno = clno;
        this.password = password;
        this.imgpath = imgpath;
        this.mno = mno;
    }

    /**
     *
     * @param sno
     * @param sname
     * @param clno
     * @param imgpath
     * @param mno
     */
    public Students(String sno, String sname, String clno, String imgpath, String mno) {
        this.sno = sno;
        this.sname = sname;
        this.clno = clno;
        this.imgpath = imgpath;
        this.mno = mno;
    }

    /**
     *
     * @param sno
     * @param sname
     * @param clno
     * @param mno
     */
    public Students(String sno, String sname, String clno, String mno) {
        this.sno = sno;
        this.sname = sname;
        this.clno = clno;
        this.mno = mno;
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
    public String getSname() {
        return sname;
    }

    /**
     * 
     */
    public void setSname(String sname) {
        this.sname = sname;
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
    public String getPassword() {
        return password;
    }

    /**
     * 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * 
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
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
        Students other = (Students) that;
        return (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getClno() == null ? other.getClno() == null : this.getClno().equals(other.getClno()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getImgpath() == null ? other.getImgpath() == null : this.getImgpath().equals(other.getImgpath()))
            && (this.getMno() == null ? other.getMno() == null : this.getMno().equals(other.getMno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getClno() == null) ? 0 : getClno().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getImgpath() == null) ? 0 : getImgpath().hashCode());
        result = prime * result + ((getMno() == null) ? 0 : getMno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sno=").append(sno);
        sb.append(", sname=").append(sname);
        sb.append(", clno=").append(clno);
        sb.append(", password=").append(password);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", mno=").append(mno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}