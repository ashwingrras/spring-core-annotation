package org.example.practice;

import org.example.config.AppConfig;
import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Class1 class1 = context.getBean(Class1.class);
        Class2 class2 = context.getBean(Class2.class);
        Class2 class2_1 = context.getBean(Class2.class);

        System.out.println(class2 == class2_1);

        class2.callClass1Method();
        System.out.println(class1.name);

    }
}
