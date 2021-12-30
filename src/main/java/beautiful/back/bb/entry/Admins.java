package beautiful.back.bb.entry;


import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName admins
 */
@NoArgsConstructor
public class Admins implements Serializable {

    /**
     * 
     */
    private String ano;

    /**
     * 
     */
    private String aname;

    /**
     * 
     */
    private String password;

    private static final long serialVersionUID = 1L;

    /**
     *
     * @param ano
     * @param aname
     */
    public Admins(String ano, String aname) {
        this.ano = ano;
        this.aname = aname;
    }

    /**
     *
     * @param ano
     * @param aname
     * @param password
     */
    public Admins(String ano, String aname, String password) {
        this.ano = ano;
        this.aname = aname;
        this.password = password;
    }

    /**
     * 
     */
    public String getAno() {
        return ano;
    }

    /**
     * 
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * 
     */
    public String getAname() {
        return aname;
    }

    /**
     * 
     */
    public void setAname(String aname) {
        this.aname = aname;
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
        Admins other = (Admins) that;
        return (this.getAno() == null ? other.getAno() == null : this.getAno().equals(other.getAno()))
            && (this.getAname() == null ? other.getAname() == null : this.getAname().equals(other.getAname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAno() == null) ? 0 : getAno().hashCode());
        result = prime * result + ((getAname() == null) ? 0 : getAname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ano=").append(ano);
        sb.append(", aname=").append(aname);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}