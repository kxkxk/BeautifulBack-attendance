package beautiful.back.bb.entry;

import java.io.Serializable;

/**
 * admins
 * @author 
 */
public class Students implements Serializable {
    private String ano;

    private String aname;

    private String password;

    private static final long serialVersionUID = 1L;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}