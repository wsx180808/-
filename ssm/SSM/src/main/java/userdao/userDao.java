package userdao;

import dean.User;

/**
 * @name:吴世祥
 * @Date：2019/4/11
 */
public interface userDao {
    public void Userid(int id);

    public void User_name_like(String name);

    public void Userinsert(User user);

    public void Userupdate(User user);

    public void Userdelete(User user);
}
