package metier;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="compte")
public class Utilisateur implements Serializable {
    private int id;
    private String login;
    private String password;
    private String role;

    public Utilisateur(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Utilisateur(int id, String login, String password,String role) {
        super();
        this.id=id;
        this.login = login;
        this.password = password;
        this.role=role;
    }

}
