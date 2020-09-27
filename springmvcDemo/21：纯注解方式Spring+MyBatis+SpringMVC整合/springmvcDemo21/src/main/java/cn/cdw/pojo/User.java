package cn.cdw.pojo;

import java.util.Date;

/**
 * @author DW-CHEN
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String realName;
    private Date birthday;

    public User() {

    }

    public User(String id, String username, String password, String realName, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realName = realName;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
