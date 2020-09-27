package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author DW-CHEN
 * 测试获取普通类型参数数据
 */
@Controller
public class TestController {

    @RequestMapping("/getRequestParam1")
    public String getRequestParam1(String name, Integer age) { //形参和请求参数名一致，获取普通类型参数数据，测试访问：http://localhost:8081/getRequestParam1?name=tom&age=12
        System.out.println( name + "  " + age);
        return "test.jsp";
    }

    @RequestMapping("/getRequestParam2")
    public String getRequestParam2(@RequestParam(value = "username",required = true,defaultValue = "cdw") String name, Integer age) { //形参和请求参数名不一致获取普通类型参数数据，测试访问：localhost:8081/getRequestParam2?username=tom&age=12
        System.out.println( name + "  " + age);
        return "test.jsp";
    }
}
