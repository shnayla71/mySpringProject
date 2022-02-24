package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }


    @Bean
    @Primary
    //@Bean(name="p1")
    PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

    @Bean
   // @Bean(name="p2")
    PartTimeMentor partTimeMentor1(){
        return new PartTimeMentor();
    }
}
