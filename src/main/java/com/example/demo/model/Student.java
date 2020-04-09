package com.example.demo.model;

import lombok.Data;

/**
 * @ClassName Student
 * @Description 学生实体类
 * @Author yuanyuan.wang
 * @Date 2020/4/8 17:49
 * @Version 1.0
 */
@Data
public class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;
}
