package spring_aop.servlet;

/**
 * name: 吳世祥
 * Date: 2019/5/13 23:14
 * Content:
 */
public class UserServleImp implements UserServlet {
    //连接点:所有的方法都是连接点，都可以成为切入点
    //切入点：所有的方法都可以时切入点，切入点方法前后都可以被增强
    //目标对象 UserServleImp 被代理的对象
    //切面，通知+切入点为切面，增强的的代码+目标对象的切入点为切面
    //织入：动词，是一个过程，将增强的代码织入到目标对象
    //代理对象:被增强后的对象
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void delect() {
        System.out.println("delect");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void find() {
        System.out.println("find");
    }
}
