package com.example.demo.handler;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.MockConfig;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @ClassName AbstractMockHandler
 * @Description mko
 * @Author yuanyuan.wang
 * @Date 2020/4/7 19:40
 * @Version 1.0
 */
public abstract class AbstractMockHandler {

    /**
     * 获取返回类型
     * @param pjp
     * @return
     * @throws NoSuchMethodException
     */
    public  Class<?> getMockResponse(ProceedingJoinPoint pjp) throws NoSuchMethodException {
        //获取类的字节码对象，通过字节码对象获取方法信息
        Class<?> targetCls= pjp.getTarget().getClass();
        //获取方法签名(通过此签名获取目标方法信息)
        MethodSignature ms= (MethodSignature)pjp.getSignature();

        //获取目标方法上的注解指定的操作名称
        Method targetMethod = targetCls.getDeclaredMethod(ms.getName(), ms.getParameterTypes());

        return targetMethod.getReturnType();
    }

    private MockConfig getMethodMockConfig(ProceedingJoinPoint pjp) {
        
    }


}
