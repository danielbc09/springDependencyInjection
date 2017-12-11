package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

/**
 * Created by bautisj on 12/11/2017.
 */
public class SetterInjectController {

    private GreetingService gretingService;

    String sayHello(){
        return gretingService.sayGreeting();
    }

    public void setGretingService(GreetingService gretingService) {
        this.gretingService = gretingService;
    }
}
