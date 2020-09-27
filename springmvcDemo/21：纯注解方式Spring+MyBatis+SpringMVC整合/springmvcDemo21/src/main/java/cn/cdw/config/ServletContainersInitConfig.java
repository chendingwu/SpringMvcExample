package cn.cdw.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;


/**
 * @author DW-CHEN
 * servlet容器初始化
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer { //SpringApplicationContextConfig核心配置加载上了才运行这个把SpringMvcConfig核心配置文件环境加载，SpringMVC它是依赖SpringApplicationContextConfig核心配置的
    protected WebApplicationContext createServletApplicationContext() { //加载springMVC核心配置文类
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(SpringMvcConfig.class);
        return annotationConfigWebApplicationContext;
    }


    protected String[] getServletMappings() { //servlet的映射配置
        return new String[]{"/"}; //拦截所有请求
    }


    protected WebApplicationContext createRootApplicationContext() {  //注意：先运行的是它，把SpringApplicationContextConfig核心配置加载上了
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(SpringApplicationContextConfig.class);
        return annotationConfigWebApplicationContext;
    }


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException { //在servlet容器启动时进行进行乱码处理
        super.onStartup(servletContext);
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        FilterRegistration.Dynamic registration = servletContext.addFilter("characterEncodingFilter", characterEncodingFilter);
        registration.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST,DispatcherType.FORWARD,DispatcherType.INCLUDE),false,"/*");

    }
}
