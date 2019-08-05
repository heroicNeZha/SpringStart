package edu.ustc.SpringStart.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyPersonService {

    @Before(value = "execution(* edu.ustc.SpringStart.service.PersonService.call(..))")
    public void beforeCall() {
        System.out.println("BeforePersonService...");
    }

    @Around(value = "execution(* edu.ustc.SpringStart.service.PersonService.call(..))")
    public void aroundCall(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("BeforePS in around");

        proceedingJoinPoint.proceed();

        System.out.println("AfterPS in around");
    }
}
