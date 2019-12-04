package dean;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.springframework.stereotype.Component;

/**
 * @name:吴世祥
 * @Date：2019/4/9
 */


public class User {
    private String user;
    private int id;
    private String pwss;
    private String a;

    public User() {
    }

    public User(String user, int id, String pwss, String a) {
        this.user = user;
        this.id = id;
        this.pwss = pwss;
        this.a = a;

    }

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", id=" + id +
                ", pwss='" + pwss + '\'' +
                ", a='" + a + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwss() {
        return pwss;
    }

    public void setPwss(String pwss) {
        this.pwss = pwss;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void v1() {
        System.out.println("v1");
    }

    public void v2() {
        System.out.println("v2");
    }
}
