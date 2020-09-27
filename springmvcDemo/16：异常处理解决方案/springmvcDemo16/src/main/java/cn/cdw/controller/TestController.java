package cn.cdw.controller;

import cn.cdw.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author DW-CHEN
 * 异常处理解决方案，把异常转换为自定义异常，通过自定义异常处理器进行处理
 * 测试访问：http://localhost:8081/test.jsp
 */
@Controller
public class TestController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@RequestBody String str) {
        //int i=1/0; //ArithmeticException异常
        //String s = null; s.length(); //NullPointerException异常

        if (str.length() > 3) { //测试下
            throw new BusinessException("出现异常"); //将异常转换为我们自定义的异常进行异常处理
        }
        System.out.println(str); //获取请求数据
        return "RESPONSE TESTING SUCCESS...."; //响应数据
    }
}
