package cn.cdw.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author DW-CHEN
 * springmvc核心配置文件
 */
@Configuration
@ComponentScan("cn.cdw")  //包扫描，注意它不会扫描到spring的bean的，因为在spring核心配置文件排除了
@EnableWebMvc  //注解驱动
public class SpringMvcConfig {
}
