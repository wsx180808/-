package userMapper;

import dean.User;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/11
 */
public class testMapper {
    public static void main(String[] args) {
        List<User> users = new user_dao_mapper().userlikes();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
