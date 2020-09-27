package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author DW-CHEN
 * 测试获取数类型，集合类型的参数数据
 */
@Controller
public class TestController6 {
    @RequestMapping("/getRequestParam8")
    public String getRequestParam8(String[] arr) { //数组类型数据，测试访问：http://localhost:8081/getRequestParam8?arr=xiaoming&arr=xiaoli&arr=xiaoxiao
        for (String s : arr) {
            System.out.println(s);
        }
        return "test.jsp";
    }

    @RequestMapping("/getRequestParam9")
    public String getRequestParam9(@RequestParam(name = "list") List<String> list) { //集合类型数据，测试访问：http://localhost:8081/getRequestParam9?list=beijing&list=shanghai&list=guizhou
        System.out.println(list);
        return "test.jsp";
    }
}
