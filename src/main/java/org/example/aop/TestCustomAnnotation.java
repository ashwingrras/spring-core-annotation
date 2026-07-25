package org.example.aop;

import java.lang.annotation.*;

// path: org.example.aop.TestCustomAnnotation
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestCustomAnnotation
{
}
