package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by bautisj on 12/11/2017.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService gretingService;

    @Autowired
    public ConstructorInjectedController(GreetingService gretingService) {

        this.gretingService = gretingService;
    }

    public String sayHello(){
        return gretingService.sayGreeting();
    }

}
