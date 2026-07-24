package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{

    // Pointcut to target methods in a specific package or class
    @Pointcut("execution(* org.example.aop.AOPService.*(..))")
    public void serviceMethods() {
        System.out.println("this is serviceMethod");
    }

    // Before Advice
    @Before("serviceMethods()")
    //@Before("execution(* org.example.aop.AOPService.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    // After Advice, coming in all cases if any exception occur or not
    // it behaves like finally in try catch, run in all cases
    @After("serviceMethods()")
    //@After("execution(* org.example.aop.AOPService.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }

    // After Returning Advice, only when method returns, not invoke in case of exception
    @AfterReturning(pointcut = "serviceMethods()", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        System.out.println("After Returning method: " + joinPoint.getSignature().getName());
        System.out.println("Method returned: " + result);
    }

    // After Throwing Advice
    @AfterThrowing(pointcut = "serviceMethods()", throwing = "exception")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception exception) {
        System.out.println("After Throwing method: " + joinPoint.getSignature().getName());
        System.out.println("Exception thrown in method: " + exception.getMessage());
    }

    // Around Advice
    //@Around("serviceMethods()")
    //@Around("execution(* org.example.aop.AOPService.*(..))")
    @Around("execution(* org.example.aop.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around method (before): " + joinPoint.getSignature().getName());

        // before part : before method start
        Object result = joinPoint.proceed(); // execute

        //Result
        System.out.println("Around Method returned: " + result);

        // after part : method complete and return
        System.out.println("Around method (after): " + joinPoint.getSignature().getName());
        return null;
    }

}
