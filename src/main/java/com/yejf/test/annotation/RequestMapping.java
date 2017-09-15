package com.yejf.test.annotation;

import java.lang.annotation.*;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
@Target({ ElementType.METHOD }) // 在方法上的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestMapping {
    String value() default "";
}
