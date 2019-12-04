package mapper;

import dean.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import javax.mail.Session;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/16
 */
public class userDao {
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

    public List<User> selectin(Integer in[]) {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<User> users = us.selectin(in);
        return users;
    }
    public List<User> selectUserList(User user) {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<User> users = us.selectUserList(user);
        return users;
    }

    public List<User> selectUserListTrim(User user) {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<User> users = us.selectUserListTrim(user);
        return users;
    }

    public List<User> userlikes() {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<User> users = us.getUserAll();
        return users;
    }

    public List<user3> getUserAllvo3() {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<user3> users = us.getUserAllvo3();
        return users;
    }

    public List<user2> userlikesvo() {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<user2> users = us.getUserAllvo();
        return users;
    }

    public User getUser(Integer id) {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        User users = us.getUser(id);
        return users;
    }

    public void insertUser(User user) {
        SqlSession sw = sq.openSession();
        userMapper us = sw.getMapper(userMapper.class);
        us.insertUser(user);
        //提交事务
        sw.commit();
    }

    public void updateUser(User user) {
        SqlSession sw = sq.openSession();
        userMapper us = sw.getMapper(userMapper.class);
        us.updateUser(user);
        //提交事务
        sw.commit();
    }
    public void updateUserSet(User user) {
        SqlSession sw = sq.openSession();
        userMapper us = sw.getMapper(userMapper.class);
        us.updateUserset(user);
        //提交事务
        sw.commit();
    }

    public void deleteUserById(int id) {
        SqlSession sw = sq.openSession();
        userMapper us = sw.getMapper(userMapper.class);
        us.deleteUserById(id);
        //提交事务
        sw.commit();

    }
    //////////////////////////////////


}
