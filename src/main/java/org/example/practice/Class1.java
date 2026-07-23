package org.example.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
// class1
public class Class1
{

    @Value("Garvit")
    String name;// = "Garvit";

    public void class1Method()
    {
        System.out.println("at class1Method");
    }


}
