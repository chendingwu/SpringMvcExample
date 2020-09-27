package cn.cdw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author SpringMvc核心配置
 */
@Configuration
@ComponentScan(value = "cn.cdw",
        excludeFilters=@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class) )  //配置只扫描加载springMVC相关的bean
public class SpringMvcConfig implements WebMvcConfigurer {

    public void addResourceHandlers(ResourceHandlerRegistry registry) { //方式一
        registry.addResourceHandler("/img/**").addResourceLocations("/img/"); //设置放行指定的资源文件
    }

  /*  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { //方式二
        configurer.enable(); //开启对所有资源的放行
    }*/
}
