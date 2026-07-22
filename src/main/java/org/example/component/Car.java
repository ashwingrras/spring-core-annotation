package org.example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    @Qualifier("petrol")
    private Engine engine;

    public void drive() {

        engine.start();

        System.out.println("Car Running");

    }

}
