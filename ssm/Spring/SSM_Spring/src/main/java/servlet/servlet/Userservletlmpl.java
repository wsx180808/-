package servlet.servlet;

import servlet.bean.User;
import servlet.dao.UserDao;
import servlet.dao.UserDaoImpl;

public class Userservletlmpl implements Userservlet {
    private UserDao ud;

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    @Override
    public User getuserBylnfo(User user) {

        return ud.getUserByInfo(user);
    }
}
