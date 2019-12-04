import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = {"mybatis.aspect","mybatis.datasource", "mybatis.controller", "mybatis.service"})
@EnableAutoConfiguration
@MapperScan(basePackages = "mybatis.userMapper")
public class App 
{
    public static void main( String[] args )
    {
        //启动springboot项目
        SpringApplication.run(App.class,args);
    }
}
