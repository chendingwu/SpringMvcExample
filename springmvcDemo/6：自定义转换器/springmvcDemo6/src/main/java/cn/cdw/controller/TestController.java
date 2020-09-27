package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author DW-CHEN
 * 测试自定义转换器
 */
@Controller
public class TestController {
    @RequestMapping("/getRequestParam")
    public String getRequestParam(Date date) {
        System.out.println(date);
        return "test.jsp";
    }
}
