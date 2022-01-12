package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService1 = applicationContext.getBean("messageService1", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService1.getMessage());
        System.out.println("1st hashCode: " + messageService.hashCode() + "\n" + "2nd hashCode: " + messageService1.hashCode());

        applicationContext.close();
    }
}
