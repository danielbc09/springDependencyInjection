package guru.services;

import org.springframework.stereotype.Service;

/**
 * Created by bautisj on 12/11/2017.
 */
@Service
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }

}
