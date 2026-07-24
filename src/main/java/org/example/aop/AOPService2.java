package org.example.aop;

import org.springframework.stereotype.Service;

@Service
public class AOPService2
{
    public String performActionService2()
    {
        System.out.println("inside performActionService2 method ***********");
        if(false)
        {
            throw  new RuntimeException("this is custom created");
        }
        System.out.println("after if");
        return "DATA SCIENCE";
    }
}
