package com.in28minuts.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //1: Launch a Spring Context - we can use the configuration class to launch the spring context
       var context =  new  AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


       //2: Configure the things that we want Spring Framework to manage -
        //Hello world configuration class- @Configuration
        //name - @Bean


        //3: Retrieving Beans managed by Spring
        System.out.println( context.getBean("name"));
        System.out.println( context.getBean("age"));
        System.out.println( context.getBean("person"));
        System.out.println( context.getBean("address2"));

        System.out.println( context.getBean("person2MethodCall"));
        System.out.println( context.getBean("person3Parameters"));

        System.out.println( context.getBean(Address.class));
        System.out.println( context.getBean(Person.class));

        System.out.println( context.getBean("person5Qualifier"));
        //System.out.printlm
       // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



    }
}
