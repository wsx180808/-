package mybatis.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration//注解到springboot容器中

@MapperScan(basePackages="mybatis.userMapper",sqlSessionFactoryRef="wushixiang1SqlSessionFactory")
public class DataSource01 {

    /**
     * @return 返回wushixiang1数据库的数据源
     */
    @Bean(name="wushixiang1DataSource")
    @Primary//主数据源,一个应用只能有一个主数据源
    @ConfigurationProperties(prefix="spring.datasource.wushixiang1")
    public DataSource dateSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * @return 返回wushixiang1数据库的会话工厂
     */
    @Bean(name = "wushixiang1SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("wushixiang1DataSource") DataSource ds) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);

        return bean.getObject();
    }

    /**
     * @return 返回wushixiang1数据库的事务
     */
    @Bean(name = "wushixiang1TransactionManager")
    @Primary//主事务
    public DataSourceTransactionManager transactionManager(@Qualifier("wushixiang1DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @return 返回test1数据库的会话模版
     */
    @Bean(name = "wushixiang1SqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(
            @Qualifier("wushixiang1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}