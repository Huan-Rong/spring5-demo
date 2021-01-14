package site.bulibucai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import site.bulibucai.MarkClass;

@Configuration
//todo 解释 @ComponentScan 注解，以及以下三种不同参数配置的作用
//@ComponentScan(basePackageClasses = MarkClass.class, useDefaultFilters = true, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Component.class}))
//@ComponentScan(basePackageClasses = MarkClass.class, useDefaultFilters = false,  includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Component.class}))
@ComponentScan(basePackageClasses = MarkClass.class, useDefaultFilters = false,  includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class}))
public class AppConfig {
}
