package ssm.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ssm.service.AccountService;


/**
 * @name:吴世祥
 * @Date：2019/5/6
 */
//@RunWith(SpringJUnit4ClassRunner.class)//使用junit进行测试，帮我们创建容器
//@ContextConfiguration("classpath:applicationContext_annotation.xml")//读取配置文件
public class Text_annotation {


    @Test
    public void run1(){
//加载配置文件
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContest.xml");
        //获取对象
       AccountService as = (AccountService) ac.getBean("accountService");
       //调用方法
        as.allAccount();
    }
}
