package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by bautisj on 12/11/2017.
 */
public class PropertyInjectedController {

    public GreetingServiceImpl gretingService;

    String sayHello(){
        return gretingService.sayGreeting();
    }

}
