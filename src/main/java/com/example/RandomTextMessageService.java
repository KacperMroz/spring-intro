package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component("messageService1")
public class RandomTextMessageService implements MessageService{

    ArrayList<String> listOfMessages = new ArrayList<>();

    public RandomTextMessageService() {
        this.listOfMessages.add("Wiadomosc 1");
        this.listOfMessages.add("Wiadomosc 2");
        this.listOfMessages.add("Wiadomosc 3");
        this.listOfMessages.add("Wiadomosc 4");
        this.listOfMessages.add("Wiadomosc 5");
        this.listOfMessages.add("Wiadomosc 6");
        this.listOfMessages.add("Wiadomosc 7");
        this.listOfMessages.add("Wiadomosc 8");
        this.listOfMessages.add("Wiadomosc 9");
        this.listOfMessages.add("Wiadomosc 10");
    }

    @Override
    public String getMessage() {
        Random random = new Random();
        return listOfMessages.get(random.nextInt(listOfMessages.size()));
    }
}
