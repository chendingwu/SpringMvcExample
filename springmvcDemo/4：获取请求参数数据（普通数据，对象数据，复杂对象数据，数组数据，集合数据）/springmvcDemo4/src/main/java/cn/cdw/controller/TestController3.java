package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DW-CHEN
 * 测试 pojo中有属性是集合的获取参数数据
 */
@Controller
public class TestController3 {
    @RequestMapping("/getRequestParam5")
    public String getRequestParam5(User3 user) { //测试访问：http://localhost:8081/getRequestParam5?name=tom&age=12&likes=ping-pong&likes=passball
        System.out.println(user);
        return "test.jsp";
    }
}


//pojo
class User3{
    private String name;
    private Integer age;
    private List<String> likes; //pojo中有集合属性

    public User3() {

    }

    public User3(String name, Integer age, List<String> likes) {
        this.name = name;
        this.age = age;
        this.likes = likes;
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

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "User3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likes=" + likes +
                '}';
    }
}
