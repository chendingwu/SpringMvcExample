package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author DW-CHEN
 * 测试异常处理
 * 测试访问：http://localhost:8081/test.jsp
 */
@Controller
public class TestController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@RequestBody String str) {
        //int i=1/0; //ArithmeticException异常
        //String s = null; s.length(); //NullPointerException异常

        System.out.println(str); //获取请求数据
        return "RESPONSE TESTING SUCCESS...."; //响应数据
    }
}
