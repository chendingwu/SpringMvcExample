package cn.cdw.mapper;

import cn.cdw.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author DW-CHEN
 * mapper
 */
public interface UserMapper {
    /**
     * 分页查询
     * @return
     */
    List<User> selectByPage();

    /**
     * 根据id查询
     * @param user
     * @return  放回查询的数据
     */
    User selectById(User user);

    /**
     * 添加数据
     * @param user
     */
    void insert(User user);

    /**
     * 更新数据
     * @param user
     */
    void update(User user);

    /**
     * 删除
     * @param user
     */
    void delete(User user);

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return  返回查询的数据
     */
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
