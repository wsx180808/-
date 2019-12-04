import dean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @name:吴世祥
 * @Date：2019/5/6
 */
public class Text {
    public static void main(String[] args) {
        //IOC的反转：创建对象这份工作由我们自己执行反转给spring帮我们执行；
        //IOC的控制：就是由spring帮我们负责创建销毁对象，掌控对象的生命周期等，我们在需要使用对象的时候跟Spring申请即可；
        //IOC是一种编程思想，也是一种新的设计模式，它需要DI（依赖注入）技术的支持；
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContest.xml");
        //通过getBean获取配置好的user对象（程序员向spring容器要对象）
        User us = ac.getBean(User.class);
        System.out.println(us.toString());
        //根据spring配置文件获取容器对象
        //ApplicationContext 配置的所有bean都会在容器创建的时候被创建出来
        //如果配置的bean较多，那么在创建容的时候，会产生内存过大的问题；这种情况在机器硬件性能较为落后的时候体现的比较明显；

    }
}
