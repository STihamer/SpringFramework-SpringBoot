package com.in28minuts.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    //in configuration class you can define spring beans
    @Bean
    public String name(){
        return "Ranga";
    }
}
