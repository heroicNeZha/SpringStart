package edu.ustc.SpringStart.service;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyPersonService {
    public void beforeCall() {
        System.out.println("BeforePersonService...");
    }

    public void aroundCall(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("BeforePS in around");

        proceedingJoinPoint.proceed();

        System.out.println("AfterPS in around");
    }
}
