package mybatis.user1Mapper;

import mybatis.bean.User;
import mybatis.bean.User1;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/7/2
 */
public interface IUser1Mapper {
    public void insert(User1 user);


    public List<User1> sele();

    public User1 seleid(Integer id);
}
