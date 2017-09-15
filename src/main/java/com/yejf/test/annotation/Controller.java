package com.yejf.test.annotation;

import java.lang.annotation.*;

/**
 * Created by hzyejinfu on 2017/9/14.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default "";
}