package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by bautisj on 12/11/2017.
 */
@Controller
public class SetterInjectController {

    private GreetingService gretingService;

    public String sayHello(){
        return gretingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGretingService(GreetingService gretingService) {
        this.gretingService = gretingService;
    }
}
