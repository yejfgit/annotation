package com.yejf.test.annotation;

import java.lang.annotation.*;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
@Target({ ElementType.FIELD }) // 代表注解的注解
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Quatifier {
    String value() default "";
}