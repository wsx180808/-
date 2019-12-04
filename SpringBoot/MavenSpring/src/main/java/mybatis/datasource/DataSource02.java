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
@MapperScan(basePackages="mybatis.user1Mapper",sqlSessionFactoryRef="wushixiang2SqlSessionFactory")
public class DataSource02 {

    /**
     * @return 返回wushixiang2数据库的数据源
     */
    @Bean(name="wushixiang2DataSource")
    @ConfigurationProperties(prefix="spring.datasource.wushixiang2")
    public DataSource dateSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * @return 返回wushixiang2数据库的会话工厂
     */
    @Bean(name = "wushixiang2SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("wushixiang2DataSource") DataSource ds) throws Exception{
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(ds);

        return bean.getObject();
    }

    /**
     * @return 返回wushixiang2数据库的事务
     */
    @Bean(name = "wushixiang2TransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("wushixiang2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    /**
     * @return 返回wushixiang2数据库的会话模版
     */
    @Bean(name = "wushixiang2SqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(
            @Qualifier("wushixiang2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}