package ssm.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import ssm.bean.Account;
import ssm.dao.Accounts;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * name: 吳世祥
 * Date: 2019/6/10 21:39
 * Content:
 */
public class Text_mybatis {
    private final static SqlSessionFactory sqlSessionFactory;
    static {
        String resource = "mybatis-config.xml";
        InputStream reader = null;
        try {
            //读取配置文件
            reader = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }// 创建SqlSessionFactoryBuilder对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }
    @Test
    public void test2(){
       //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句
        try {

            Accounts dao= sqlSession.getMapper(Accounts.class);
          List<Account> accounts=  dao.allAccount();
          for (Account account:accounts){
              System.out.println(accounts.toString());
          }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();

        }
    }
}
