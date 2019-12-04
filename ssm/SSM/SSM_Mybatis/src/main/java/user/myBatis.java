package user;

import dean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/9
 */
public class myBatis {
    public static void main(String[] args) {
        try {
            new myBatis().findUserByIdTest();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private final static SqlSessionFactory sqlSessionFactory;

    //加载配置文件
    //在这里对SqlSessionFactory进行创建，后面只需要调用即可。
    static {
        String resource = "mybatis-config.xml";
        Reader reader = null;
        try {
            //读取配置文件
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }// 创建SqlSessionFactoryBuilder对象
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }


    public void findUserByIdTest() throws Exception {
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql语句
        try {
            /*执行SqlSession查询，第一个参数是User.xml中的ststement的id，第二个是sql执行的参数*/
            List<User> user = sqlSession.selectList("mapper.userMapper.getUser", 1);
            System.out.println(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

}




