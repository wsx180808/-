package mapper;

import dean.User;
import dean.user2;
import dean.user3;

import java.util.List;

/**
 * @author z
 * @name:吴世祥
 * @Date：2019/4/16
 */
public interface userMapper {
    public List<User> getUserAll();

    public User getUser(Integer id);

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUserById(int id);

    public List<user2> getUserAllvo();

    public List<user3> getUserAllvo3();

    public List<User> selectUserList(User user);

    public List<User> selectUserListTrim(User user);

    public void updateUserset(User user);

    public List<User> selectin(Integer[] in);
}
