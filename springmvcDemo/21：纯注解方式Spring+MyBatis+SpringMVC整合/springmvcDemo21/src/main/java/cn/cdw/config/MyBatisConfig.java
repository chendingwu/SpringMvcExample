package cn.cdw.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author DW-CHEN
 * 配置MyBatis
 */
public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean getDataSource(@Autowired DataSource dataSource,@Autowired Interceptor  pageInterceptor) {  //配置获取数据源
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);  //数据源
        //sqlSessionFactoryBean.setTypeAliasesPackage("cn.cdw.pojo");  //因为使用的是纯注解的方式，所以不需要别名
        sqlSessionFactoryBean.setPlugins(pageInterceptor); //添加PageHelper分页插件
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer scannerConfigurer() { //配置mybatis映射
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("cn.cdw.mapper");

        return mapperScannerConfigurer;
    }


    @Bean("pageInterceptor")
    public Interceptor getPageInterceptor() {  //PageHelper插件
        Interceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");//配置数据库方言
        properties.setProperty("reasonable", "true");//处理第一页和最后页问题
        interceptor.setProperties(properties);
        return interceptor;
    }
}
