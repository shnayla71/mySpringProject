package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Selenium {

    OfficeHours officeHours;

    public void getTeachingHours(){
        System.out.println("Weekly office hours "+( 10+ officeHours.getHours()));
    }
}
