package site.bulibucai.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//todo 解释 @Scope("prototype") 注解的作用
@Scope("prototype")
public class OneComponent {
}
