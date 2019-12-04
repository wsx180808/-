package servlet.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import servlet.bean.User;

import java.io.IOException;
import java.io.InputStream;


public class UserDaoImpl implements UserDao {
private User usera;

    public void setUsera(User usera) {
        this.usera = usera;
    }

    public static SqlSessionFactory sq;

    static {
        String resource = "mybatis-config.xml";

        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sq = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSessionFactory


    }

    @Override
    public User getUserByInfo(User user) {
        //通过数据库获取用户
        UserDao us = sq.openSession().getMapper(UserDao.class);
        usera = us.getUserByInfo(user);
        return usera;

    }
}
