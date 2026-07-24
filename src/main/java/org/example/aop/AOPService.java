package org.example.aop;

import org.springframework.stereotype.Service;

@Service
public class AOPService
{

    public String performAction()
    {
        System.out.println("inside performAction method ***********");
        if(false)
        {
            throw  new RuntimeException("this is custom created");
        }
        System.out.println("after if");
        return "JAVA FULLSTACK";
    }

}
