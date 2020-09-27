package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author DW-CHEN
 * 设置session值
 */
@Controller
@SessionAttributes(names = {"sessionName1","sessionName2"})
public class TestController1 {

    @RequestMapping("/test5")
    @ResponseBody
    public String test5(Model model) { //设置session值
        model.addAttribute("sessionName1", "tom");
        model.addAttribute("sessionName2", "jack");
        return "set session success....";
    }

    @RequestMapping("/test6")
    @ResponseBody
    public String test6(@SessionAttribute("sessionName1")String sessionValue1, @SessionAttribute("sessionName2")String sessionValue2) {
        System.out.println(sessionValue1 + "  "+ sessionValue2);
        return sessionValue1 + "  "+ sessionValue2;
    }
}
