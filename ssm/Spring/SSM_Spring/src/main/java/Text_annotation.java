import dean.User4;

import dean.user3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * @name:吴世祥
 * @Date：2019/5/6
 */
//@RunWith(SpringJUnit4ClassRunner.class)//使用junit进行测试，帮我们创建容器
//@ContextConfiguration("classpath:applicationContext_annotation.xml")//读取配置文件
public class Text_annotation {
//    @Resource(name = "user")
//    private  User4 user;
//    @Test
//    public void testJunit (){
//        System.out.println(user.toString());
//    }
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");

        User4 us = (User4) ac.getBean("user4");
        ac.close();
        System.out.println(us.toString());


    }
}
