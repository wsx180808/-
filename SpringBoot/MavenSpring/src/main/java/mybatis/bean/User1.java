package mybatis.bean;



/**
 * @name:吴世祥
 * @Date：2019/7/2
 */
public class User1 {
    private String user;
    private Integer id;
    private String pass;
    private String a;

    @Override
    public String toString() {
        return "User1{" +
                "user='" + user + '\'' +
                ", id=" + id +
                ", pass='" + pass + '\'' +
                ", a='" + a + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public User1() {
    }

    public User1(String user, Integer id, String pass, String a) {
        this.user = user;
        this.id = id;
        this.pass = pass;
        this.a = a;
    }
}
