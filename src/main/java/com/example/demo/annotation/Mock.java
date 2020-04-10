package com.example.demo.annotation;

import com.example.demo.enums.MockType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yuanyuan.wang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Mock {

    /**
     * mock开关
     */
    boolean mockSwitch() default false;

    /**
     * mock 类型
     */
    int mockType() default 1;

}
