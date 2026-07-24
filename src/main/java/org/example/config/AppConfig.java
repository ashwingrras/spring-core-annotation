package org.example.config;

import org.example.component.Printer;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class AppConfig
{

    /*@Bean
    public Student student()
    {
        return  new Student();
    }*/

    @Bean
    public String collegeName() {

        return "ABC College";

    }

    /*@Bean
    public Printer printer() {

        return new Printer();

    }*/


}
