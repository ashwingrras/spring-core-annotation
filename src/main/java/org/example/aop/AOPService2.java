package org.example.aop;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AOPService2
{
    // want aop
    public String performActionService2()
    {
        System.out.println(" start time " + new Date());
        System.out.println("inside performActionService2 method ***********");
        if(false)
        {
            throw  new RuntimeException("this is custom created");
        }
        System.out.println("after if");
        System.out.println(" end time " + new Date());
        return "DATA SCIENCE";
    }


    // don't want aop
    public String performNewActionService2()
    {
        System.out.println(" start time "+ new Date());
        System.out.println("inside performNewActionService2 method ***********");
        if(false)
        {
            throw  new RuntimeException("this is custom created");
        }
        System.out.println("after if");
        System.out.println(" end time " + new Date());
        return "DATA SCIENCE";
    }
}
