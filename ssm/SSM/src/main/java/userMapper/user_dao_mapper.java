package userMapper;

import dean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/11
 */
public class user_dao_mapper {
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

    public void findUserById(int id) {
        //生产一个sqlsession
        userMapper us = sq.openSession().getMapper(userMapper.class);
        User user = us.findUserById(id);
        System.out.println(user.toString());
    }

    public List<User> userlikes() {
        userMapper us = sq.openSession().getMapper(userMapper.class);
        List<User> users = us.userlikes("吴");
        return users;
    }

    public List<User> all() {
        userMapper sas = sq.openSession().getMapper(userMapper.class);
        List<User> lisu =sas.findUserByIdAll();
       return lisu;
    }
}
