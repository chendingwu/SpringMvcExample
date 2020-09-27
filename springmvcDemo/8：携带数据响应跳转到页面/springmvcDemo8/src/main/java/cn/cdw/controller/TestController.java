package cn.cdw.controller;

import cn.cdw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author DW-CHEN
 * 测试携带数据响应跳转页面
 */
@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1(HttpServletRequest req) {
        req.setAttribute("name", "小明");
        req.setAttribute("age", 12); //通过HttpServletRequest设置响应数据,仅封装跳转页面的基本信息，
        return "testPage1.jsp";
    }

    @RequestMapping("/test2")
    public String test2(Model model){ //通过Model类型的形参设置响应数据，仅封装数据
        model.addAttribute("name", "小李");
        model.addAttribute("age", 15);
        return "testPage2.jsp";
    }

    @RequestMapping("/test3")
    public ModelAndView test3(ModelAndView modelAndView){ //通过ModelAndView类型的形参设置响应数据，封装数据和封装视图
        modelAndView.addObject("name", "小希小");
        modelAndView.addObject("age", 13);

        User user = new User("夏利", 16);
        modelAndView.addObject("user", user);
        modelAndView.setViewName("testPage3.jsp");
        return modelAndView;
    }
}


