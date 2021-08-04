package com.udacity.jdnd.review;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {
    private String message;

    public String upperCase(){
        return message.toUpperCase();
    }

    public String lowerCase(){
        return message.toLowerCase();
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("service message has been created");
    }
}
