package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by bautisj on 12/11/2017.
 */
public class ConstructorInjectedController {

    private GreetingService gretingService;

    public ConstructorInjectedController(GreetingService gretingService) {

        this.gretingService = gretingService;
    }

    String sayHello(){
        return gretingService.sayGreeting();
    }

}
