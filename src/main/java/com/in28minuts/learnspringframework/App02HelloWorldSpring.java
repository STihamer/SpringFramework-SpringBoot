package com.in28minuts.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //1: Launch a Spring Context - we can use the configuration class to launch the spring context
       var context =  new  AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


       //2: Configure the things that we want Spring Framework to manage -
        //Hello world configuration class- @Configuration
        //name - @Bean


        //3: Retrieving Beans managed by Spring
        System.out.println( context.getBean("name"));


    }
}
