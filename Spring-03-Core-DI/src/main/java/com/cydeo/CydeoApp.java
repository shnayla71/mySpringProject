package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext ct=new AnnotationConfigApplicationContext(ConfigApp.class);

        Java jv=ct.getBean(Java.class);
        Selenium sl=ct.getBean(Selenium.class);

        jv.getTeachingHours();
        sl.getTeachingHours();
    }
}
