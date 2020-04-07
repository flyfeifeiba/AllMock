package com.example.demo.advice;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * @ClassName MockAdvice
 * @Description mock 处理
 * @Author yuanyuan.wang
 * @Date 2020/4/7 19:09
 * @Version 1.0
 */
public class MockAdvice {

    public void doAround(ProceedingJoinPoint pjp) throws Throwable {
        //获取方法名
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();

        Class<?> classTarget=pjp.getTarget().getClass();
        Class<?>[] par=((MethodSignature) pjp.getSignature()).getParameterTypes();




        if (args != null && args.length != 0 ) {

            System.out.println("LoggerAdvice," + "执行方法:" + signature.getName() + "参数：" + JSON.toJSONString(args));
        }
        //pjp.proceed();





    }

}
