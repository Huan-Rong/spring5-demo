package site.bulibucai;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * 引入外部属性文件
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        DruidDataSource druidDataSource = (DruidDataSource) applicationContext.getBean("datasource", DataSource.class);

        System.out.println(druidDataSource.getDriverClassName());
        System.out.println(druidDataSource.getUrl());
        System.out.println(druidDataSource.getUsername());
        System.out.println(druidDataSource.getPassword());

        druidDataSource.close();
    }
}
