package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * Created by bautisj on 12/11/2017.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        return greetingService.sayGreeting();
    }
}
