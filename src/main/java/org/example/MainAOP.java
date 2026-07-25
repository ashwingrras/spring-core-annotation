package org.example;

import org.example.aop.AOPService;
import org.example.aop.AOPService2;
import org.example.aop.AOPService_Annotation;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/*
    @Around("@annotation(org.example.aop.Loggable)")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().getName();
        System.out.println("[Around] Before method: " + methodName);

        long start = System.currentTimeMillis();

        Object result = null;
        try {
            result = joinPoint.proceed(); // execute target method
        } catch (Exception ex) {
            System.out.println("[Around] Exception in method: " + methodName);
            throw ex;
        }

        long end = System.currentTimeMillis();

        System.out.println("[Around] After method: " + methodName);
        System.out.println("[Around] Execution time: " + (end - start) + " ms");

        return result;
    }
    */

/*
        AOP : aspect oriented programming

        middle ware


         house entry  <---> Main Gate <--------> house exit
                            middle ware


           before this method   <--->    tax calculate  <----> after this method

           before this method   <--->    invoice create  <----> after this method

           before this method   <--->    invoice download  <----> after this method

            AOP:

            EnableAspectJAutoProxy   : activate AOP on project

            1. Aspect     : class where aop methods ( point cut) manage
            2. Join Point : method who works to apply aop
            3. Point Cut  : where path or annotation will provide to activate on join point
            4. Before     : control before calling method
            5. After      : control after called method, run on every time, exception occur or not
            6. After Returning : control once return data, not working if any exception occur
            7. After Throwing : if any exception occur it will call
            8. Around  : combination of before + after
                         before
                         after


            sequence:
            1. before
            2. after returning
            3. after





 */


public class MainAOP
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        /*AOPService aopService = context.getBean(AOPService.class);
        aopService.performAction();*/
        /*AOPService2 aopService2 = context.getBean(AOPService2.class);
        aopService2.performActionService2();*/

        AOPService_Annotation aopService = context.getBean(AOPService_Annotation.class);
        aopService.performAction2();
    }
}
