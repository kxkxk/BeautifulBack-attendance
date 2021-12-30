package beautiful.back.bb.entry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName teachers
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    /**
     *
     */
    private String uuid;

    private static final long serialVersionUID = 1L;


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
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        result = prime * result + ((getTname() == null) ? 0 : getTname().hashCode());
        result = prime * result + ((getMno() == null) ? 0 : getMno().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
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
        sb.append(", uuid=").append(uuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}