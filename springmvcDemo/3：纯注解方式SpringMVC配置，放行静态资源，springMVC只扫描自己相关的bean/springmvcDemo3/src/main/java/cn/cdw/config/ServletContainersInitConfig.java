package cn.cdw.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


/**
 * @author DW-CHEN
 * servlet容器初始化
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    protected WebApplicationContext createServletApplicationContext() { //加载springMVC核心配置文类
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(SpringMvcConfig.class);
        return annotationConfigWebApplicationContext;
    }


    protected String[] getServletMappings() { //servlet的映射配置
        return new String[]{"/"}; //拦截所有请求
    }


    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

}
