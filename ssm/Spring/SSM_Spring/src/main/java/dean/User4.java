package dean;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.PostPersist;

/**
 * @name:吴世祥
 * @Date：2019/4/9
 */
//等同于<bean name="user" class="dean.User4" lazy-init="true" scope="prototype" init-method="v1" destroy-method="v2">
@Component("user4")
//@Controller 对应web
//@Service 对应Service
//@Repository 对应DAO   这几个注解功能相同
//scope 是否是单例 prototype多例 singleton单例 request 他的生命周期会与request请求一致 session 生命周期与session一致
@Scope(scopeName = "prototype")
public class User4 {
    @Value("as")//给属性增加默认数据 推荐在set方法上使用，该方式暴力注入
    private String user;
    private int id;
    private String pwss;
    private String a;

    public User4() {
    }

    public User4(String user, int id, String pwss, String a) {
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
    @Value("我问问")//给属性增加默认数据
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
    @PostConstruct
    public void syso(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void syso2(){
        System.out.println("销毁拉");
    }
}
