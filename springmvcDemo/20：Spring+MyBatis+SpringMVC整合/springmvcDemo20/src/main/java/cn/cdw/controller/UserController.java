package cn.cdw.controller;

import cn.cdw.pojo.User;
import cn.cdw.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author DW-CHEN
 * controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{page}/{size}")
    public PageInfo<User> userPageInfo(@PathVariable("page") Integer page, @PathVariable("size") Integer size) { //分页查询
        PageInfo<User> pageInfo = userService.selectByPage(page, size);
        return pageInfo;
    }

    @GetMapping("/{id}")
    public User selectById(@PathVariable("id") String id) { //根据id查询
        User user = new User();
        user.setId(id);

        return userService.selectById(user);
    }

    @PostMapping
    public String add(@RequestBody User user) { //添加
        userService.insert(user);
        return "add success";
    }

    @PutMapping
    public String update(@RequestBody User user) { //更新
        userService.update(user);
        return "update success";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) { //删除
        User user = new User();
        user.setId(id);

        userService.delete(user);
        return "delete success";
    }

    @PostMapping("/login")
    public User login(String username, String password) { //登录
        return userService.login(username, password);

    }
}
