package src.main.java.dean;

public class User1 {
    private String user;

    private Integer id;

    private String pwss;

    private String a;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPwss() {
        return pwss;
    }

    public void setPwss(String pwss) {
        this.pwss = pwss == null ? null : pwss.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }
}