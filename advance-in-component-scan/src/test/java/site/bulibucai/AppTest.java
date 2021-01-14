package site.bulibucai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestConstructor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.bulibucai.component.OneComponent;
import site.bulibucai.config.AppConfig;
import site.bulibucai.controller.AccountController;
import site.bulibucai.controller.UserController;
import site.bulibucai.dao.UserDao;
import site.bulibucai.service.UserService;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {site.bulibucai.config.AppConfig.class})
public class AppTest {

    @Autowired(required = false)
    private UserController userController;

    @Autowired(required = false)
    private AccountController accountController;

    @Autowired(required = false)
    private UserService userService;

    @Autowired(required = false)
    private UserDao userDao;

    @Autowired(required = false)
    private OneComponent oneComponent;

    @Test
    public void componentScanTest() {
        System.out.println("controller:" + userController);
        System.out.println("controller:" + accountController);
        System.out.println("service:" + userService);
        System.out.println("repository:" + userDao);
        System.out.println("component:" + oneComponent);
    }

}
