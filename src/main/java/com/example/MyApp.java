package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        MessageService myNameMessageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService randomTextMessageService = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(myNameMessageService.getMessage());
        System.out.println(randomTextMessageService.getMessage());
        System.out.println("1st hashCode: " + myNameMessageService.hashCode() + "\n" + "2nd hashCode: " + randomTextMessageService.hashCode());

    }
}
