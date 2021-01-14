package site.bulibucai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import site.bulibucai.bean.User;
import site.bulibucai.service.UserService;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getOne(Integer id) {
        return userService.getOne(id);
    }
}
