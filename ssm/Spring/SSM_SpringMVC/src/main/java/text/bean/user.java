package text.bean;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * name: 吳世祥
 * Date: 2019/5/22 20:37
 * Content:
 */
public class user implements Serializable {
    private String name;
    private String password;
    private Double moder;

    private user2 user2;
    private Date date;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", moder=" + moder +
                ", user2=" + user2 +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public text.bean.user2 getUser2() {
        return user2;
    }

    public void setUser2(text.bean.user2 user2) {
        this.user2 = user2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getModer() {
        return moder;
    }

    public void setModer(Double moder) {
        this.moder = moder;
    }
}
