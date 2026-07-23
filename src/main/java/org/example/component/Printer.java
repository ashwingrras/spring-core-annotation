package org.example.component;

import org.springframework.stereotype.Component;

// bean: printer
@Component
public class Printer {

    public void print(String msg) {

        System.out.println(msg);

    }

}
