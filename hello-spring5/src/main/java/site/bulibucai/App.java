package site.bulibucai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.bulibucai.bean.Account;

/**
 * 一个 Spring 5 入门程序
 */
public class App {
    public static void main(String[] args) {
        //todo
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Account account = applicationContext.getBean("account", Account.class);

        System.out.println(account);
    }
}
