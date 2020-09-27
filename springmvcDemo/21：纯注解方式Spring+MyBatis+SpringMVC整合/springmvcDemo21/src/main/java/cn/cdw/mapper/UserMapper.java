package cn.cdw.mapper;

import cn.cdw.pojo.User;
import org.apache.ibatis.annotations.*;

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
    @Select("select * from user")
    List<User> selectByPage();

    /**
     * 根据id查询
     * @param user
     * @return  放回查询的数据
     */
    @Select("select * from user  where id=#{id}")
    User selectById(User user);

    /**
     * 添加数据
     * @param user
     */
    @Insert("insert  into  user values(#{id},#{username},#{password},#{realName},#{birthday})")
    void insert(User user);

    /**
     * 更新数据
     * @param user
     */
    @Update("update user set username=#{username},password=#{password},realName=#{realName},birthday=#{birthday}  where id=#{id}")
    void update(User user);

    /**
     * 删除
     * @param user
     */
    @Delete("delete from user where id=#{id}")
    void delete(User user);

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return  返回查询的数据
     */
    @Select("select * from user where username = #{username} and password=#{password}")
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
