package cn.cdw.controller;

import cn.cdw.groups.GroupA;
import cn.cdw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 使用hibernate-validator的校验框架对表单进行校验
 * 表单校验，测试访问：http://localhost:8080/test.jsp
 * 注意：需要使用tomcat8.5版本以上的服务器!
 */
@Controller
public class TestController {

    /*@RequestMapping("/test1")
    public String test1(@Valid User user, Errors errors, Model model) { //因为下面测试方法写了分组校验范围，所有这里就是校验没有被分组的表单了
        if (errors.hasErrors()) {
            for (FieldError fieldError : errors.getFieldErrors()) {
                model.addAttribute(fieldError.getField(), fieldError.getDefaultMessage());//封装响应的提示信息，名称是属性名
            }
            return "test.jsp";//跳转到注册页面
        }
        System.out.println("test success....");
        return "success.jsp";
    }*/

    @RequestMapping("/test1") //测试分组校验
    public String test1(@Validated({GroupA.class}) User user, Errors errors, Model model) {  //@Validated指定只校验标有GroupA.class组的属性标志表单
        if (errors.hasErrors()) {
            for (FieldError fieldError : errors.getFieldErrors()) {
                model.addAttribute(fieldError.getField(), fieldError.getDefaultMessage());//封装响应的提示信息，名称是属性名
            }
            return "test.jsp";//跳转到注册页面
        }
        System.out.println("test success....");
        return "success.jsp";
    }
}
