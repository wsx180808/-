package servlet.bean;

/**
 * @name:吴世祥
 * @Date：2019/5/7
 */
public class User {
    private Integer u_id;
    private String u_username;
    private String u_userpass;

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_username='" + u_username + '\'' +
                ", u_userpass='" + u_userpass + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer u_id, String u_username, String u_userpass) {
        this.u_id = u_id;
        this.u_username = u_username;
        this.u_userpass = u_userpass;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
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
