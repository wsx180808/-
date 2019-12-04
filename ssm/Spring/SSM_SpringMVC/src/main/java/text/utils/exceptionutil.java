package text.utils;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * name: 吳世祥
 * Date: 2019/6/5 20:32
 * Content:异常处理器
 */
public class exceptionutil implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        exception es = null;
        if (ex instanceof exception) {
            es = (exception) ex;

        } else {
            es = new exception("系统正在维护中。。。。。");
        }
        //创建ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ex", es.getMessoge());
        modelAndView.setViewName("/text/ExceptionOK");
        System.out.println("运行了异常处理器");
        System.out.println(es.getMessoge());
        return modelAndView;
    }
}
