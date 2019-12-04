package mybatis.userMapper;

import mybatis.bean.User;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/6/25
 */
public interface IUserMapper {
//    方式一
//    @Insert("INSERT INTO USER VALUES(#{id},#{u_username},#{u_userpass})")
//    public void insert(User user);
//
//    @Select("select * from user")
//    public List<User> sele();
//    方式二

    public void insert(User user);


    public List<User> sele();

    public User seleid(Integer id);
}
