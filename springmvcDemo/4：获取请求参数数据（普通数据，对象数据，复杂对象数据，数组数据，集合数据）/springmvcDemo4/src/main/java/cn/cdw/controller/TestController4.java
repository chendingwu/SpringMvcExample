package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author DW-CHEN
 * 测试pojo中有属性是集合对象类型的属性获取请求参数数据
 */
@Controller
public class TestController4 {
    @RequestMapping("/getRequestParam6")
    public String getRequestParam6(User4 user) { //测试访问：http://localhost:8081/getRequestParam6?name=tom&age=12&listCity[0].cityName=beijing&listCity[0].job=java&listCity[1].cityName=shanghai&listCity[1].job=javaEE
        System.out.println(user);
        return "test.jsp";
    }
}

class User4 {
    private String name;
    private Integer age;
    private List<City4> listCity; //pojo中有list集合的对象属性

    public User4() {

    }

    public User4(String name, Integer age, List<City4> listCity) {
        this.name = name;
        this.age = age;
        this.listCity = listCity;
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

    public List<City4> getListCity() {
        return listCity;
    }

    public void setListCity(List<City4> listCity) {
        this.listCity = listCity;
    }

    @Override
    public String toString() {
        return "User4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", listCity=" + listCity +
                '}';
    }
}


class City4{
    private String cityName;
    private String job;

    public City4() {

    }

    public City4(String cityName, String job) {
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
        return "City4{" +
                "cityName='" + cityName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}