package spring_aop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import servlet.servlet.Userservletlmpl;
import spring_aop.servlet.UserServleImp;
import spring_aop.servlet.UserServlet;

import javax.annotation.Resource;
import java.awt.print.Book;

/**
 * name: 吳世祥
 * Date: 2019/5/15 20:36
 * Content:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/./applicAop.xml")
public class Aop_test {
    public static void main(String[] args) {
        UserServletProxy usy = new UserServletProxy();
        UserServlet us = new UserServleImp();
        UserServlet ust = usy.getUserServletProxy(us);
        ust.find();
    }

    @Resource(name = "userServle")//如果实现接口，必须写接口
    UserServlet  us;

    @Test
    public void test() {
us.save();

    }
}
