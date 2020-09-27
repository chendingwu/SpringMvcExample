package cn.cdw.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DW-CHEN
 * Restful风格
 */
/*@Controller
@ResponseBody*/
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("{id}")
    public String test1(@PathVariable Integer id) { //测试访问：http://localhost:8081/user/100
        System.out.println("TESTING SUCCESS... "+id);
        return id+"";
    }
}
