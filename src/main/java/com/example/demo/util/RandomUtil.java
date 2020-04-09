package com.example.demo.util;

import java.util.Random;

/**
 * @ClassName RandomUtil
 * @Description 随机工具类
 * @Author yuanyuan.wang
 * @Date 2020/4/9 17:28
 * @Version 1.0
 */
public class RandomUtil {
    /**
     * 随机产生一个Integer
     * @return
     */
    public static Integer randomInteger() {
        return new Random().nextInt();
    }

    /**
     * 随机产生一个Long
     * @return
     */
    public static Long randomLong() {
        return new Random().nextLong();
    }

    /**
     * 随机产生一个Double
     * @return
     */
    public static Double randomDouble() {
        return new Random().nextDouble();
    }



    /**
     * 随机产生一个Float
     * @return
     */
    public static Float randomFloat() {
        return new Random().nextFloat();
    }


    /**
     * 随机产生一个Long
     * @return
     */
    public static Byte randomByte() {
        //todo
        return null;
    }
    /**
     * 随机产生一个Boolean
     * @return
     */
    public static Boolean randomBoolean() {
        return new Random().nextBoolean();
    }
    /**
     * 随机产生一个Short
     * @return
     */
    public static Short randomShort() {
        //todo
        return null;
    }
    /**
     * 随机产生一个Char
     * @return
     */
    public static Character randomChar() {
        //todo
        return null;
    }

}
