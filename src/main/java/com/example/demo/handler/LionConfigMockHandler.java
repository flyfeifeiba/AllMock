package com.example.demo.handler;

import com.example.demo.model.MockConfig;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName LionConfigMockHandler
 * @Description TODO
 * @Author yuanyuan.wang
 * @Date 2020/4/9 18:00
 * @Version 1.0
 */
public class LionConfigMockHandler {



    private List<MockConfig> getMockConfig() {
        MockConfig mockConfig = new MockConfig();
        mockConfig.setMockData("mockData");
        mockConfig.setFunctionName("test");
        mockConfig.setPath("");
        return Arrays.asList(mockConfig);
    }














}
