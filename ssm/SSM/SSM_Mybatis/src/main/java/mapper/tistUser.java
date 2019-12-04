package mapper;


import dean.User;

import java.util.List;

/**
 * @name:吴世祥
 * @Date：2019/4/16
 */
public class tistUser {
    public static void main(String[] args) {
        //查询所有
         List<User> users = new userDao().userlikes();
         for (User us : users) {
             System.out.println(us.toString());
         }
        //根据id查询

//        User us = new userDao().getUser(12);
//        System.out.println(us.toString());


        //新增
        //new userDao().insertUser(new User("吴世祥呀", 7, "314", "樟树"));

        //删除
        //new  userDao().deleteUserById(1);

        //修改
        //new userDao().updateUser(new User("吴世祥", 7, "314", "樟树"));

        //多表连查所有一对一
//        List<user2> users = new userDao().userlikesvo();
//        for (user2 us : users) {
//            System.out.println(us.toString());
//        }

        //多表连查所有一对多
//        List<user3> users = new userDao().getUserAllvo3();
//        for (user3 us : users) {
//            System.out.println(us.toString());
//        }

//        List<User> users = new userDao().selectUserList(new User("吴",1,null,null));
//        for (User us:users){
//            System.out.println(us.toString());
//        }
        //set标签
//        User us = new User();
//        us.setUser("wushixiang");
//        new userDao().updateUserSet(us);


        //foreach标签
//        Integer a[] = {1, 3, 4};
//        List<User> users = new userDao().selectin(a);
//        for (User us :users){
//            System.out.println(us.toString());
//        }

//        User1Example ex = new User1Example();
//        ex.createCriteria().andIdEqualTo(1);
//        List<User1> uss = new userDao().selectUser1(ex);
//        for(User1 ussa:uss){
//            System.out.println(ussa.toString());
//        }
    }
}
