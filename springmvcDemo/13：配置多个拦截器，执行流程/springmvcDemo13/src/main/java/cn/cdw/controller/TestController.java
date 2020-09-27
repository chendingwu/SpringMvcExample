package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 配置多个拦截器，看它的执行流程
 */
@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1() {
        System.out.println("-------------------------------------------------------------main----------main");
        return "test.jsp";
    }
}
