package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by bautisj on 12/11/2017.
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService gretingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService gretingService) {

        this.gretingService = gretingService;
    }

    public String sayHello(){
        return gretingService.sayGreeting();
    }

}
