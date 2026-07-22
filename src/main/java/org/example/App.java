package org.example;

import org.example.component.Car;
import org.example.component.Printer;
import org.example.config.AppConfig;
import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Prototype : " + (s1 == s2));

        StudentService service = context.getBean(StudentService.class);

        service.register();

        Car car = context.getBean(Car.class);

        car.drive();

        String college = context.getBean("collegeName", String.class);

        System.out.println(college);

        Printer p1 = context.getBean(Printer.class);
        Printer p2 = context.getBean(Printer.class);
        p1.print("printing  1111111");
        p2.print("printing  2222222 ");

    }
}
