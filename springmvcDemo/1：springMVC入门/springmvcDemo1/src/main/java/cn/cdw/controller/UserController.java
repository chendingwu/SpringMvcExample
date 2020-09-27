package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 测试springMVC
 */
@Controller
public class UserController {
    @RequestMapping("/test")
    public String quickMethod(){
        System.out.println("TESTING SUCCESS.....");
        return "test.jsp";
    }
}
