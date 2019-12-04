package web.Exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

/**
 * @name:吴世祥
 * @Date：2019/6/16
 */
@ControllerAdvice//声明切面
public class ExceptionHande {
    @ExceptionHandler(RuntimeException.class)//捕获运行时异常
    @ResponseBody
    public Map<String, Object> exceptionHande() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errormsg", "系统错误");
        return map;
    }
}
