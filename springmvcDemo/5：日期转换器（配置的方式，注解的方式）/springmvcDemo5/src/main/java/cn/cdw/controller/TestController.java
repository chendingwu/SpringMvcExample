package cn.cdw.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author DW-CHEN
 * 测试 ,日期类型转换，默认没有在springMVC核心配置文件配置自定义日期转换器时访问测试：http://localhost:8081/getRequestParam?date=2020/01/1
 */
@Controller
public class TestController {

   /* @RequestMapping("/getRequestParam") //日期转换器配置方式
    public String getRequestParam(Date date) { //在springMVC中自定义配置了日期格式转换器，访问测试：http://localhost:8081/getRequestParam?date=2020-01-01
        System.out.println(date);
        return "test.jsp";
    }*/


    @RequestMapping("/getRequestParam1") //日期转换器注解方式，需要在springMVC核心配置文件中开启springMVC注解驱动
    public String getRequestParam1(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {  //使用注解方式，测试访问：localhost:8081/getRequestParam1?date=2020-01-01
        System.out.println(date);
        return "test.jsp";
    }
}
