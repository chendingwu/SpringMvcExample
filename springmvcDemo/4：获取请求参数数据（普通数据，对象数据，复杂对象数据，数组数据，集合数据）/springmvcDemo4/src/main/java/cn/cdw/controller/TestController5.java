package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author DW-CHEN
 * 测试pojo中有map集合中有对象类型的请求参数数据获取
 */
@Controller
public class TestController5 {
    @RequestMapping("/getRequestParam7")
    public String getRequestParam7(User5 user){ //测试访问：http://localhost:8081/getRequestParam7?name=tom&age=12&mapCity['city1'].cityName=beijing&mapCity['city1'].job=java&mapCity['city2'].cityName=shanghai&mapCity['city2'].job=javaEE
        System.out.println(user);
        return "test.jsp";
    }
}


//pojo
class User5{
    private String name;
    private Integer age;
    private Map<String,City5> mapCity;//pojo中的map集合对象属性

    public User5() {

    }

    public User5(String name, Integer age, Map<String, City5> mapCity) {
        this.name = name;
        this.age = age;
        this.mapCity = mapCity;
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

    public Map<String, City5> getMapCity() {
        return mapCity;
    }

    public void setMapCity(Map<String, City5> mapCity) {
        this.mapCity = mapCity;
    }

    @Override
    public String toString() {
        return "User5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", map=" + mapCity +
                '}';
    }
}






class City5{
    private String cityName;
    private String job;

    public City5() {

    }

    public City5(String cityName, String job) {
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
        return "City5{" +
                "cityName='" + cityName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}