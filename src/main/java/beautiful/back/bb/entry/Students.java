package beautiful.back.bb.entry;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName students
 */
@NoArgsConstructor
@AllArgsConstructor
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
    private String password;

    /**
     *
     */
    private String imgpath;

    /**
     *
     */
    private String mno;

    /**
     *
     */
    private String uuid;

    /**
     *
     */
    private String wxid;

    private static final long serialVersionUID = 1L;

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

    /**
     *
     */
    public String getUuid() {
        return uuid;
    }

    /**
     *
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     *
     */
    public String getWxid() {
        return wxid;
    }

    /**
     *
     */
    public void setWxid(String wxid) {
        this.wxid = wxid;
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
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getImgpath() == null ? other.getImgpath() == null : this.getImgpath().equals(other.getImgpath()))
                && (this.getMno() == null ? other.getMno() == null : this.getMno().equals(other.getMno()))
                && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
                && (this.getWxid() == null ? other.getWxid() == null : this.getWxid().equals(other.getWxid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getImgpath() == null) ? 0 : getImgpath().hashCode());
        result = prime * result + ((getMno() == null) ? 0 : getMno().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getWxid() == null) ? 0 : getWxid().hashCode());
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
        sb.append(", password=").append(password);
        sb.append(", imgpath=").append(imgpath);
        sb.append(", mno=").append(mno);
        sb.append(", uuid=").append(uuid);
        sb.append(", wxid=").append(wxid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}