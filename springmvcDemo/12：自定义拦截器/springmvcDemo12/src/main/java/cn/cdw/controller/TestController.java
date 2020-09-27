package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 测试自定义拦截器
 */
@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1() {
        System.out.println("main..........main.................main");
        return "test.jsp";
    }
}
