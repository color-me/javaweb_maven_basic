package cdu.csf.model;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String name;
    private String password;
    private String sex;
    private String hobby;

    public User(){

    }

    public User(String name, String password, String sex, String hobby) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.hobby = hobby;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) { this.sex = sex; }

    public String getHobby() { return hobby; }

    public void setHobby(String hobby) { this.hobby = hobby; }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
