package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class LoggingAspect_CustomAnnotation
{
    @Pointcut("@annotation(org.example.aop.TestCustomAnnotation)")
    public void serviceMethods() {
        System.out.println("this is serviceMethod");
    }

    //@Before("@annotation(org.example.aop.TestCustomAnnotation)")
    @Before("serviceMethods()")
    public void beforeMethod(JoinPoint joinPoint)
    {
        System.out.println("at before() this method :  " + joinPoint.getSignature().getName()+", time "+new Date());
    }

}
