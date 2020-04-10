package com.example.demo.service;

import com.example.demo.annotation.Mock;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Description 测试类
 * @Author yuanyuan.wang
 * @Date 2020/4/7 18:53
 * @Version 1.0
 */
@Service("testService")
public class TestService {


    @Mock
    public Integer test() {
        return 1;
    }

}
