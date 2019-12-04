import dean.User;
import dean.user2;
import dean.user3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @name:吴世祥
 * @Date：2019/5/6
 */
public class Text_lnjection {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContest_lnjection.xml");
        //set方式
        //user2 us = ac.getBean(user2.class);
        //构造方法
        //user2 us = (user2) ac.getBean("user3");
        //复杂方法注入
        user3 us = (user3) ac.getBean("user3");
        System.out.println(us.toString());


    }
}
