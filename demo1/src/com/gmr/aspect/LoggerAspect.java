package com.gmr.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Description 切面，附加的功能（日志）
 * @Author GanMingRan
 * @Date 2019/9/24 15:04
 **/
public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("start log:" + joinPoint.getSignature().getName());
        return object;
    }
}
