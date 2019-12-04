import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @name:吴世祥
 * @Date：2019/6/16
 */
//@ComponentScan(basePackages = {"web.controller","web.controller"})配置多个包，扫描包，相当于前端控制器
@ComponentScan(basePackages = {"web.controller","web.Exception"})

@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
