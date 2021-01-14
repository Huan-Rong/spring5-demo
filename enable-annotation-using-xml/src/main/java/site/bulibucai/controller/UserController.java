package site.bulibucai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import site.bulibucai.bean.User;
import site.bulibucai.service.UserService;

//todo 解释 @Controller 注解的作用
@Controller
public class UserController {

    private UserService userService;

    //todo 解释 setUserService 方法的注解 @Autowired 的作用
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getOne(Integer id) {
        return userService.getOne(id);
    }
}
