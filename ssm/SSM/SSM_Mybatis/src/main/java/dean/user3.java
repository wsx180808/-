package dean;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/24
 */
public class user3 extends User{
    private List<User> users ;

    private int wu;
    private String shi;
    private String xiang;

    public user3(List<User> users, int wu, String shi, String xiang) {
        this.users = users;
        this.wu = wu;
        this.shi = shi;
        this.xiang = xiang;
    }

    public user3(String user, int id, String pwss, String a, List<User> users, int wu, String shi, String xiang) {
        super(user, id, pwss, a);
        this.users = users;
        this.wu = wu;
        this.shi = shi;
        this.xiang = xiang;
    }

    @Override
    public String toString() {
        return "user3{" +
                "users=" + users +
                ", wu=" + wu +
                ", shi='" + shi + '\'' +
                ", xiang='" + xiang + '\'' +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public user3() {
    }

    public user3(int wu, String shi, String xiang) {
        this.wu = wu;
        this.shi = shi;
        this.xiang = xiang;
    }

    public int getWu() {
        return wu;
    }

    public void setWu(int wu) {
        this.wu = wu;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getXiang() {
        return xiang;
    }

    public void setXiang(String xiang) {
        this.xiang = xiang;
    }
}
