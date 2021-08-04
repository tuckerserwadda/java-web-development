package website.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * the controller sets the end point
 * creates the methods to get and post by implimenting the service class
 * create a service model and then create its its constructor
 * create the get mapping end point that gets the messages
 * create the post mapping end poit
 */
@Controller
public class UserInputController {
    private UserInputService userInputService;

    public UserInputController(UserInputService userInputService) {
        this.userInputService = userInputService;
    }
    @GetMapping("/userInput")
    public  String getUserInput(@ModelAttribute("newMessage") UserInputForm newMessage, Model model){
        model.addAttribute("messages", this.userInputService.getMessages());
        return "userInput";
    }
    @PostMapping("/userInput")
    public String postUserInput(@ModelAttribute("newMessage") UserInputForm userInputForm, Model model){
        userInputService.addMessage(userInputForm.getText());
        model.addAttribute("greetings",userInputService.getMessages());
        userInputForm.setText("");
        return "userInput";

    }
}
