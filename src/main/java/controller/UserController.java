package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/doLogin")
    @ResponseBody
    public User doLogin(User user, HttpSession session){
        User user1=userService.isLogin(user);
        if (user1!=null){
            return user1;
        }else{
            return user1;
        }
    }

    @RequestMapping("/jsonLogin")
    @ResponseBody
    public User doLoginPost(@RequestBody User user, HttpSession session){
        User user1=userService.isLogin(user);
        if (user1!=null){
            return user1;
        }else{
            return user1;
        }
    }
}
