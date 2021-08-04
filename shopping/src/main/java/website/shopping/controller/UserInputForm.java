package website.shopping.controller;

/**
 *  this is a form class that gets and sets the values of the user input
 *  the get method gets the text and the set method sets the state of the text
 *  the variable text has the same name as the the field attribute
 */
public class UserInputForm {
    private String text;
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text= text;
    }
}
