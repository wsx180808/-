package spring_aop.test;


import spring_aop.servlet.UserServleImp;
import spring_aop.servlet.UserServlet;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * name: 吳世祥
 * Date: 2019/5/13 23:17
 * Content:User代理类
 */
public class UserServletProxy {
    //代理类：UserServletProxy
    //被代理类：UserServlet
    public UserServlet getUserServletProxy(UserServlet userServlet) {

        return(UserServlet)Proxy.newProxyInstance(UserServletProxy.class.getClassLoader(), UserServleImp.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强代码
                System.out.println("开启事务");
                //调用原始方法
                Object invoke = method.invoke(userServlet,args);
                System.out.println("回滚事务");
                return invoke;
            }
        });

    }
}
