package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DW-CHEN
 * 测试 pojo中有对象属性的获取参数数据
 */
@Controller
public class TestController2 {
    @RequestMapping("/getRequestParam4")
    public String getRequestParam4(User2 user) { //测试访问：http://localhost:8081/getRequestParam4?name=tom&age=12&city.cityName=shanghai&city.job=java
        System.out.println(user);
        return "test.jsp";
    }
}


//pojo
class User2{
    private String name;
    private Integer age;
    private City2 city; //pojo中包含对象属性

    public User2() {

    }

    public User2(String name, Integer age, City2 city) {
        this.name = name;
        this.age = age;
        this.city = city;
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

    public City2 getCity() {
        return city;
    }

    public void setCity(City2 city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}



class City2{
    private String cityName;
    private String job;

    public City2() {

    }

    public City2(String cityName, String job) {
        this.cityName = cityName;
        this.job = job;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "City2{" +
                "cityName='" + cityName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
