package com.gmr.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Description 切面，附加的功能（日志）
 * @Author GanMingRan
 * @Date 2019/9/24 15:04
 **/
@Aspect
@Component("loggerAspect")
public class LoggerAspect {
    @Around(value = "execution(* com.gmr.service.EatService.*(..)))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("start log:" + joinPoint.getSignature().getName());
        return object;
    }
}
