package cn.cdw.service.test;

import cn.cdw.pojo.User;
import cn.cdw.service.UserService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @author DW-CHEN
 * junit测试UserService业务层
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestUserService {
    @Autowired
    private UserService userService;

    @Test
    public void Test1() { //测试添加
            String uuid = UUID.randomUUID().toString();
            userService.insert(new User(uuid,"tom","123","xiaoming",new Date()));
    }

    @Test
    public void test2() {//测试分页查询
        PageInfo<User> pageInfo = userService.selectByPage(2, 3); //从第二页开始查询，每页显示3条数据
        System.out.println(pageInfo);

        for (int i = 0; i < 3; i++) {
            System.out.println(pageInfo.getList().get(i)); //因为这里获取到的的是pageInfo信息，所有把它里面的3条数据通过pageInfo根据索引取出来
        }
    }

    @Test
    public void test3() { //测试根据id查询
        User user = new User();
        user.setId("dbcad179-b2ad-45c5-8a55-58a91a024e28");
        System.out.println(userService.selectById(user));
    }


    @Test
    public void test4() { //测试根据id修改数据
        User user = new User("d804fa86-c5cf-401e-bec6-35fc2855eeaf", "小明修改", "123修改", "xiaoming修改", new Date());
        userService.update(user);
    }


    @Test
    public void test5() {//测试根据id删除数据
        User user = new User();
        user.setId("be19d084-abc7-4040-b146-ff715d0862ae");
        userService.delete(user);
    }

    @Test
    public void test6() { //测试根据用户名和密码查询用户
        System.out.println(userService.login("小明", "123"));
    }

}
