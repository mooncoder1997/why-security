package com.why.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ClassName: TimeAspect
 * Description: TODO
 * Date: 2019-06-10 22:50
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
//@Aspect
//@Component
public class TimeAspect {

    @Around("execution(* com.why.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("time aspect start");
        Object[] args = pjp.getArgs();
        for (Object arg: args) {
            System.out.println("arg is " + arg);
        }
        long start = new Date().getTime();
        Object object = pjp.proceed();
        System.out.println("time aspect 耗时: " + (new Date().getTime() - start));
        System.out.println("time aspect end");
        return object;
    }
}
