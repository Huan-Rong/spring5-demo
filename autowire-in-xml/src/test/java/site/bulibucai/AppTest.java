package site.bulibucai;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.bulibucai.bean.Account;


/**
 * XML 中使用自动装配
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class AppTest {

    //todo 解释 @Autowired @Qualifier 注解的作用
    @Autowired
    @Qualifier("bankAccount")
    private Account bankAccount;

    @Autowired
    @Qualifier("alibabaAccount")
    private Account alibabaAccount;

    @Test
    public void getAccountTest() {
        System.out.println(bankAccount);
        System.out.println(alibabaAccount);
    }
}
