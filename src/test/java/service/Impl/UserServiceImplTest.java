package service.Impl;

import entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void isLogin() {
        User user=new User("123","123");
        User u=userService.isLogin(user);
        System.out.println(u.toString());
    }
}