package beautiful.back.bb.entry;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName class
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Class implements Serializable {
    /**
     *
     */
    private String id;

    /**
     *
     */
    private String clno;

    /**
     *
     */
    private String sno;

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
        Class other = (Class) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getClno() == null ? other.getClno() == null : this.getClno().equals(other.getClno()))
                && (this.getSno() == null ? other.getSno() == null : this.getSno().equals(other.getSno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClno() == null) ? 0 : getClno().hashCode());
        result = prime * result + ((getSno() == null) ? 0 : getSno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", clno=").append(clno);
        sb.append(", sno=").append(sno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}