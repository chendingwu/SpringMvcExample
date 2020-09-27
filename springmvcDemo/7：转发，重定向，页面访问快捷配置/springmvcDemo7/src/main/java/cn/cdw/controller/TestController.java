package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 测试无数据跳转页面
 */
@Controller
public class TestController {
    @RequestMapping("/test1")
    public String test1() { //默认请求页面就是转发
        return "testPage1.jsp";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "forward:testPage2.jsp"; //转发，请求路径不变
    }

    @RequestMapping("/test3")
    public String test3() {
        return "redirect:testPage3.jsp"; //重定向，请求路径会发生变化
    }

    @RequestMapping("/test4")
    public String test4() {
        return "forward:/WEB-INF/pages/testPage4.jsp"; //转发到WEB-INF下的资源页面
    }

    @RequestMapping("/test5")
    public String test5() {
        return "redirect:/WEB-INF/pages/testPage5.jsp"; //重定向到WEB-INF下的资源页面,注意重定向是访问不到WEB-INF下的资源页面的
    }

    @RequestMapping("/test6")
    public String test6() { //使用springMVC核心配置文件刚才配置的快捷访问页面的配置
        return "testPage6";
    }
}
