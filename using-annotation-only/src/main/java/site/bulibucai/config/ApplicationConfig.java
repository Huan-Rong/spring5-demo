package site.bulibucai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//todo 解释 @Configuration 注解的作用
@Configuration
//todo 解释 @ComponentScan 注解的作用
@ComponentScan(basePackages = "site.bulibucai")
public class ApplicationConfig {
}
