package com.example.demo.model;

import lombok.Data;

/**
 * @ClassName MockConfig
 * @Description TODO
 * @Author yuanyuan.wang
 * @Date 2020/4/9 18:01
 * @Version 1.0
 */
@Data
public class MockConfig {

    /**
     * 函数路径
     */
    private String path;

    /**
     * 函数名
     */
    private String functionName;

    /**
     * mock数据
     */
    private Object mockData;



}
