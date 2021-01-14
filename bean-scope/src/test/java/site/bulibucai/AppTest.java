package site.bulibucai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.bulibucai.component.OneComponent;
import site.bulibucai.config.AppConfig;
import site.bulibucai.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void getBeanTest() {
        UserController user1 = applicationContext.getBean(UserController.class);
        UserController user2 = applicationContext.getBean(UserController.class);
        System.out.println(user1 == user2);//true

        OneComponent oc1 = applicationContext.getBean(OneComponent.class);
        OneComponent oc2 = applicationContext.getBean(OneComponent.class);
        System.out.println(oc1 == oc2);//false
    }
}
