package cn.cdw.service.impl;

import cn.cdw.mapper.UserMapper;
import cn.cdw.pojo.User;
import cn.cdw.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DW-CHEN
 * service业务层实现类
 */
@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    public PageInfo<User> selectByPage(int page, int size) { //分页查询
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.selectByPage();
        /*for (User user : userList) {
            System.out.println(user);
        }*/ //数据
        return  new PageInfo<User>(userList);
    }

    public User selectById(User user) { //根据id查询
        User u = new User();
        u.setId(user.getId());

        return userMapper.selectById(u);
    }

    public void insert(User user) { //添加
        userMapper.insert(user);
        System.out.println("添加成功...");
    }

    public void update(User user) { //修改
        userMapper.update(user);
        System.out.println("修改成功....");
    }

    public void delete(User user) { //删除
        User user2 = new User();
        user2.setId(user.getId());

        userMapper.delete(user);
        System.out.println("删除成功.....");
    }

    public User login(String username, String password) {//登录
        return userMapper.selectByUsernameAndPassword(username, password);
    }
}
