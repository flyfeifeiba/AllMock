package com.example.demo.enums;

import lombok.Getter;

/**
 * mock 类型
 */
@Getter
public enum MockType {
    RandomMock(1, "随机mock"),
    ;
    MockType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private int code;
    private String desc;

}
