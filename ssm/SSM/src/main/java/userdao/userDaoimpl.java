package userdao;

import dean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/10
 */
public class userDaoimpl implements userDao {
    private static SqlSessionFactory sq;


    static {
        String resource = "mybatis-config.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //需要SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        //创建SqlSessionFactory
        sq = ssfb.build(in);
        //生产一个sqlsession

    }

    public static void main(String[] args) {
        new userDaoimpl().Userid(1);
    }
    @Override
    public void Userid(int id) {
        SqlSession sson = sq.openSession();
        User us = sson.selectOne("User.findUserById", id);
        //输出
        System.out.println(us.toString());
    }

    @Override
    public void User_name_like(String name) {
        SqlSession sson = sq.openSession();
        List<User> us = sson.selectList("userlike", name);
        //输出
        for (User usa : us) {
            System.out.println(usa.toString());
        }

    }
    @Override
    public void Userinsert(User user) {
        SqlSession sson = sq.openSession();
        System.out.println(sson.insert("userinsert", user));
        sson.commit();
    }
    @Override
    public void Userupdate(User user) {
        SqlSession sson = sq.openSession();
        System.out.println(sson.update("userupdate", user));
        sson.commit();
    }
    @Override
    public void Userdelete(User user) {
        SqlSession sson = sq.openSession();
        System.out.println(sson.delete("userdelete", user.getUser()));
        sson.commit();
    }
}
