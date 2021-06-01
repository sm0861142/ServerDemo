package entity;

import javax.jws.soap.SOAPBinding;
import java.sql.Time;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String picture;
    private String email;
    private String salt;
    private Time regist_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Time getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(Time regist_time) {
        this.regist_time = regist_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", picture='" + picture + '\'' +
                ", email='" + email + '\'' +
                ", salt='" + salt + '\'' +
                ", regist_time=" + regist_time +
                '}';
    }
}
