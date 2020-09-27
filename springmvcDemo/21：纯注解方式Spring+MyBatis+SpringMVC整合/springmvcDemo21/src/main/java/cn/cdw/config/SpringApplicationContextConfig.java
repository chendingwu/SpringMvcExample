package cn.cdw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author DW-CHEN
 * Spring核心配置
 */
@Configuration  //把当前类作为spring核心配置类
@ComponentScan(value = "cn.cdw",excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}))  //配置注解驱动包扫描,spring的核心配置文件不加载Controller对应的bean的，Controlled也是加载不到spring的bean
@PropertySource("classpath:jdbc.properties")  //加载资源配置文件
@Import({JDBCConfig.class,MyBatisConfig.class})  //配置导入第三方资源
@EnableTransactionManagement
public class SpringApplicationContextConfig {

    @Bean("transactionManager")  //注意，transactionManager名称不能改变，因为开启事务它默认就是找这个名称的bean
    public DataSourceTransactionManager getTxManager(@Autowired DataSource dataSource) { //配置事务
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
