package tobyspring.helloboot;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component    // 메타 어노테이션(어노테이션에 붙는 어노테이션)
public @interface MyComponent {
}
