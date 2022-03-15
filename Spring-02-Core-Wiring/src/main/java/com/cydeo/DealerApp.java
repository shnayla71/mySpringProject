package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext contex=new AnnotationConfigApplicationContext(ConfigCar.class);

        Car car=contex.getBean(Car.class);
        Person person=contex.getBean(Person.class);

        System.out.println(car.getName());
        System.out.println(person.getName());
        System.out.println(person.getCar().getName());
    }
}
