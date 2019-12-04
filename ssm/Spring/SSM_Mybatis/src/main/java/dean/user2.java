package dean;

/**
 * @name:吴世祥
 * @Date：2019/4/24
 */
public class user2 extends User{
    private User uservo;
    private int wu;
    private String shi;
    private String xiang;

    public user2(User user, int wu, String shi, String xiang) {
        this.uservo = user;
        this.wu = wu;
        this.shi = shi;
        this.xiang = xiang;
    }

    @Override
    public String toString() {
        return "user2{" +
                "uservo=" + uservo +
                ", wu=" + wu +
                ", shi='" + shi + '\'' +
                ", xiang='" + xiang + '\'' +
                '}';
    }

    public User getUservo() {
        return uservo;
    }

    public void setUservo(User uservo) {
        this.uservo = uservo;
    }

    public user2() {
    }

    public user2(int wu, String shi, String xiang) {
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
