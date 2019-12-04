package servlet.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import servlet.servlet.AccountSerlvet;

import javax.annotation.Resource;

/**
 * name: 吳世祥
 * Date: 2019/5/18 15:41
 * Content:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContest_servlet.xml")//读取配置文件
public class mappertest {
    @Resource(name = "accountSerlvet")
    private AccountSerlvet as;

    @Test
    public void Test1() {
        as.transferAccount();
    }


}
