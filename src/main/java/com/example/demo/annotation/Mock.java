package com.example.demo.annotation;

/**
 * @author yuanyuan.wang
 */
public @interface Mock {

    /**
     * mock开关
     */
    boolean mockSwitch() default false;

    Integer mockType() default

}
