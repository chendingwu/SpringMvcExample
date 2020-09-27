package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 测试
 */
@Controller
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("TESTING  SUCCESS......");
        return "test.jsp";
    }
}
