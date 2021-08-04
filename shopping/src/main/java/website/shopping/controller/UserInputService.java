package website.shopping.controller;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * this service class that creates the model
 * create varaibles to store the fiels inputs
 * create apost constructor to to instatiate the variables or model using the @PostConstruct annotation
 * create both get and add void methods
 */
@Service
public class UserInputService {
    private  List<String> messages;

    @PostConstruct
    public void postConstruct(){
        this.messages = new ArrayList<>();
    }
    public void addMessage(String message){
        messages.add(message);
    }
    // get method gets the array of messages
    public List<String> getMessages(){
        return new ArrayList<>(this.messages);
    }

}
