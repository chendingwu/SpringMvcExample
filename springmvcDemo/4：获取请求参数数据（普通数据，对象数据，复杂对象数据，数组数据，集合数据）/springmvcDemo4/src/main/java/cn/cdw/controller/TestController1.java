package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 测试获取pojo类型参数
 */
@Controller
public class TestController1 {
    @RequestMapping("/getRequestParam3")
    public String getRequestParam3(User1 user) { //测试访问：http://localhost:8081/getRequestParam3?name=tom&age=12
        System.out.println(user);
        return "test.jsp";
    }
}

class User1{
    private String name;
    private Integer age;

    public User1() {

    }
    public User1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}