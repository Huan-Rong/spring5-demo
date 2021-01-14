package site.bulibucai;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class AppTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void getDataSourceTest() {
        DruidDataSource druidDataSource = (DruidDataSource) dataSource;

        System.out.println(druidDataSource.getDriverClassName());
        System.out.println(druidDataSource.getUrl());
        System.out.println(druidDataSource.getUsername());
        System.out.println(druidDataSource.getPassword());

        druidDataSource.close();
    }
}
