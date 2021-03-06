package com.example.demo.advice;

import com.alibaba.fastjson.JSON;
import com.example.demo.annotation.Mock;
import com.example.demo.handler.RandomMockHandler;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @ClassName MockAdvice
 * @Description mock 处理
 * @Author yuanyuan.wang
 * @Date 2020/4/7 19:09
 * @Version 1.0
 */
public class MockAdvice {
    @Autowired
    private RandomMockHandler randomMockHandler;

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //获取类的字节码对象，通过字节码对象获取方法信息
        Class<?> targetCls= pjp.getTarget().getClass();
        //获取方法签名(通过此签名获取目标方法信息)
        MethodSignature ms= (MethodSignature)pjp.getSignature();

        //获取目标方法上的注解指定的操作名称
        Method targetMethod = targetCls.getDeclaredMethod(ms.getName(), ms.getParameterTypes());

        Annotation mockAnnotation = targetMethod.getAnnotation(Mock.class);
        if (mockAnnotation == null) {
            return pjp.proceed();

        }
        return randomMockHandler.mock(pjp);


    }

}
