package cn.cdw.controller;

import cn.cdw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DW-CHEN
 * 接收异步请求参数，接收普通参数，对象参数，集合参数
 * 访问测试：http://localhost:8081/test.jsp
 */
@Controller
public class TestController {
    @RequestMapping("/test1")
    public String test1(@RequestBody String name) { //异步接收普通参数数据
        System.out.println(name);
        return "success.jsp";
    }

    @RequestMapping("/test2")
    public String test1(@RequestBody User user) { //异步接收对象参数数据
        System.out.println(user);
        return "success.jsp";
    }

    @RequestMapping("/test3")
    public String test3(@RequestBody List<User> userList) { //异步接收List集合对象参数数据
        System.out.println(userList);
        return "success.jsp";
    }

    @RequestMapping("/test4")
    @ResponseBody
    public String test4() { //响应普通类型数据
        return "data.....";
    }


    @RequestMapping("/test5")
    @ResponseBody
    public User test5() { //响应对象数据
        User user = new User(1, "tom", 12);
        return user;
    }


    @RequestMapping("/test6")
    @ResponseBody
    public List<User> test6() { //响应集合数据
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "tom", 12));
        list.add(new User(2, "jack", 15));
        list.add(new User(3, "tony", 21));

        return list;
    }
}
