package org.example;

import org.example.aop.AOPService;
import org.example.aop.AOPService2;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAOP
{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AOPService aopService = context.getBean(AOPService.class);
        //aopService.performAction();
        AOPService2 aopService2 = context.getBean(AOPService2.class);
        aopService2.performActionService2();
    }
}
