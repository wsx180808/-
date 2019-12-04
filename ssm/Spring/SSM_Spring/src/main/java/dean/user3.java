package dean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

/**
 * @name:吴世祥
 * @Date：2019/4/24
 */
@Component("user3")
public class user3 {
    private List list;
    private Map map;
    private Object[] obj;
    private Set set;
    private Properties properties;
    private User4 user;

    public user3(List list, Map map, Object[] obj, Set set, Properties properties, User4 user) {
        this.list = list;
        this.map = map;
        this.obj = obj;
        this.set = set;
        this.properties = properties;
        this.user = user;
    }

    public User4 getUser() {
        return user;
    }
@Autowired//自动装配，自动找到这个bean,自动赋予默认值
//@Resource(name = "user")  手动装配，当applicationContest配置了该bean该位置需要手动装配name值填入bean的name值
    public void setUser(User4 user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "user3{" +
                "list=" + list +
                ", map=" + map +
                ", obj=" + Arrays.toString(obj) +
                ", set=" + set +
                ", properties=" + properties +
                ", user=" + user +
                '}';
    }

    public user3() {
    }



    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
