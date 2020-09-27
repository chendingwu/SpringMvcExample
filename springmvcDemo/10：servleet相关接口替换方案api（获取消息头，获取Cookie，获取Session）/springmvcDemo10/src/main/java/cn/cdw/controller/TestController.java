package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author DW-CHEN
 * servlet相关接口替换方案api
 */
@Controller
public class TestController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@RequestHeader("Accept-Language") String headerInfo) { //获取消息头数据
        System.out.println(headerInfo);
        return headerInfo;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2(@CookieValue("JSESSIONID") String jsessionid){ //获取cookie数据
        System.out.println(jsessionid);
        return jsessionid;
    }

    @RequestMapping("/test3")
    @ResponseBody
    public String test3(HttpSession session) {
        session.setAttribute("sessionName", "tom");
        return "add session success....";
    }

    @RequestMapping("/test4")
    @ResponseBody
    public String test4(@SessionAttribute("sessionName") String sessionValue) {
        System.out.println(sessionValue);
        return sessionValue;
    }
}
