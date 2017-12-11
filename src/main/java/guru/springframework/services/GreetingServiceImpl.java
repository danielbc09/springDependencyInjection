package guru.springframework.services;

/**
 * Created by bautisj on 12/11/2017.
 */
public class GreetingServiceImpl implements GreetingService{


    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
