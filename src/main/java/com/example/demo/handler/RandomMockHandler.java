package com.example.demo.handler;

import com.alibaba.fastjson.JSON;
import com.example.demo.util.ClassUtil;
import com.example.demo.util.RandomUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @ClassName JsonConfigMockHandler
 * @Description 随机mock
 * @Author yuanyuan.wang
 * @Date 2020/4/7 19:37
 * @Version 1.0
 */
@Component
public class RandomMockHandler  extends AbstractMockHandler{


    @Override
    public Object mock(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        Class<?> clazz = getMockResponse(pjp);
        if (ClassUtil.isPrimitiveOrWarpPrimitive(clazz)) {
            return dealPrimitive(clazz);
        } else {
            //todo
        }
        return null;
    }

    private Object dealPrimitive(Class<?> clazz) {
        //byte or Byte
        if (clazz.equals(byte.class) || clazz.equals(Byte.class)) {
            return RandomUtil.randomByte();
        }
        //boolean or Boolean
        if (clazz.equals(boolean.class) || clazz.equals(Boolean.class)) {
            return RandomUtil.randomBoolean();
        }
        //short or Short
        if (clazz.equals(short.class) || clazz.equals(Short.class)) {
            return RandomUtil.randomShort();
        }
        //int or Integer
        if (clazz.equals(int.class) || clazz.equals(Integer.class)) {
            return RandomUtil.randomInteger();
        }
        //long or Long
        if (clazz.equals(long.class) || clazz.equals(Long.class)) {
            return RandomUtil.randomLong();
        }
        //float or Float
        if (clazz.equals(float.class) || clazz.equals(Float.class)) {
            return RandomUtil.randomFloat();
        }
        //double or Double
        if (clazz.equals(double.class) || clazz.equals(Double.class)) {
            return RandomUtil.randomDouble();
        }
        //char or Character
        if (clazz.equals(char.class) || clazz.equals(Character.class)) {
            return RandomUtil.randomChar();
        }
        return null;
    }




}
