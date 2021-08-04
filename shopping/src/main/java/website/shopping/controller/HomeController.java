package website.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model1, Model model2){
        // display the current time stamp in the home page
        model1.addAttribute("hello", Instant.now().toString());
        model2.addAttribute("greetings", new String[]{"hello", "hi", "goodbye"});
        return "home";
    }
}
