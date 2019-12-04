package mybatis.bean;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */
public class User {
    private Integer id;
    private String u_username;
    private String u_userpass;

    public User() {
    }

    public User(Integer id, String u_username, String u_userpass) {
        this.id = id;
        this.u_username = u_username;
        this.u_userpass = u_userpass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", u_username='" + u_username + '\'' +
                ", u_userpass='" + u_userpass + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_userpass() {
        return u_userpass;
    }

    public void setU_userpass(String u_userpass) {
        this.u_userpass = u_userpass;
    }
}
