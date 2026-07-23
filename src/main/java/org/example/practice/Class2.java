package org.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class Class2
{

    // field injection
    //@Autowired
    Class1 class1; //= new Class1();

    public Class1 getClass1() {
        return class1;
    }

    // setter injection
    @Autowired
    public void setClass1(Class1 class1) {
        this.class1 = class1;
    }

    // constructor injection
    //@Autowired
    /*public Class2(Class1 class1)
    {
        this.class1 = class1;
    }*/

    public void callClass1Method()
    {
        class1.class1Method();
    }


}
