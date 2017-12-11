package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by bautisj on 12/11/2017.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello My Controllelr");
        return "foo";
    }
}
