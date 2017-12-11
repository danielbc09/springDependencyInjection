package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by bautisj on 12/11/2017.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl gretingService;

    public String sayHello(){
        return gretingService.sayGreeting();
    }

}
