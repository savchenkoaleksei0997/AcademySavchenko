package by.academy.classwork.lesson11;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Version {

    int age() default 0;
    String name() default "";
    String[] products() default{};

}
