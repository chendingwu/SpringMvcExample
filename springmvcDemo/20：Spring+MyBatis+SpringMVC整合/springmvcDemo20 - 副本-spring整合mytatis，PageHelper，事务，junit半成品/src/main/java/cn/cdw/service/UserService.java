package cn.cdw.service;

import cn.cdw.pojo.User;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DW-CHEN
 * service
 */
@Transactional(readOnly = true) //添加事务管理
public interface UserService {

    PageInfo<User> selectByPage(int page, int size);

    User selectById(User user);

    @Transactional(readOnly = false)
    void insert(User user);

    @Transactional(readOnly = false)
    void update(User user);

    @Transactional(readOnly = false)
    void delete(User user);

    User login(String username, String password);
}
