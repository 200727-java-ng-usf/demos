package com.revature.quizzard.web.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("within(com.revature.quizzard..*)")
    public void logAll() {

    }

    @Before("logAll()") // reuses pointcut from logAll
    public void logMethodStart(JoinPoint jp) {
        String methodSig = jp.getTarget().getClass().toString() + "." + jp.getSignature().getName();
        String argStr = Arrays.toString(jp.getArgs());
        System.out.println(methodSig + "invoked at " + LocalDateTime.now());
        System.out.println("Input arguments: " + argStr);
    }

//    @AfterReturning(value = "logAll()", returning = "returned")
//    public void logMethodReturn(JoinPoint jp, Object returned) {
//
//    }
//
//    @AfterThrowing(pointcut="logAll()", throwing="e")
//    public void errorOccurrence() {
//
//    }

}
