package cn.cdw.controller;

import cn.cdw.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DW-CHEN
 * 测试响应jsong格式数据
 */
@Controller
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public User test1() {//返回对象json格式数据
        User user = new User(1, "小明", 12);
        return user;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<User> test2() {//返回集合类型json格式数据
        ArrayList<User> arrayList = new ArrayList();
        arrayList.add(new User(1, "小乐乐", 12));
        arrayList.add(new User(2, "小小熊", 15));
        arrayList.add(new User(3, "夏利", 17));

        return arrayList;
    }
}

