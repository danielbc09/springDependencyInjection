package guru.springframework.services;

/**
 * Created by bautisj on 12/11/2017.
 */
public class SetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }

}
