package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName TestServiceTest
 * @Description TODO
 * @Author yuanyuan.wang
 * @Date 2020/4/8 18:14
 * @Version 1.0
 */
@SpringBootTest
public class TestServiceTest {
    @Autowired
    private TestService testService;


    @Test
    public void test() {
        System.out.println(testService.test());
    }
}
