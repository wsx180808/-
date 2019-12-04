package text.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * name: 吳世祥
 * Date: 2019/5/22 20:37
 * Content:
 */
public class userListMap implements Serializable {
    private String name;
    private String password;
    private Double moder;
    private List<user2> list;
    private Map<String,user2> map;

    @Override
    public String toString() {
        return "userListMap{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", moder=" + moder +
                ", list=" + list +
                ", map=" + map +
                '}';
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

    public List<user2> getList() {
        return list;
    }

    public void setList(List<user2> list) {
        this.list = list;
    }

    public Map<String, user2> getMap() {
        return map;
    }

    public void setMap(Map<String, user2> map) {
        this.map = map;
    }
}