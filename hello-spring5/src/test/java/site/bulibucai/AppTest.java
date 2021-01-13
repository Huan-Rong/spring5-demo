package site.bulibucai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.bulibucai.bean.Account;


//todo
@RunWith(SpringJUnit4ClassRunner.class)
//todo
@ContextConfiguration(locations = "classpath:spring.xml")
public class AppTest {

    //todo
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void getAccountTest() {
        Account account = applicationContext.getBean("account", Account.class);
        System.out.println(account);
    }
}
