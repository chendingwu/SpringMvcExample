package cn.cdw.pojo;

import cn.cdw.groups.GroupA;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * @author DW-CHEN
 *
 */
public class User {
    @NotBlank(message = "用户名不能为空",groups = GroupA.class) //指定分组校验
    private String name;

    @NotNull(message = "年龄不能为空",groups = GroupA.class)
    @Max(value = 100,message = "年龄最大不能超过100",groups = GroupA.class)
    @Min(value = 18,message = "年龄不能小于18",groups = GroupA.class)  //指定分组校验
    private Integer age;

    @Valid
    private City city;  //校验引用类型的属性

    public User() {

    }

    public User(String name, Integer age, City city) {
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}
