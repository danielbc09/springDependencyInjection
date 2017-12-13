package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by bautisj on 12/11/2017.
 */
@Service
public class GreetingServiceImpl implements GreetingService{


    public static final String HELLO_GURUS = "Hello from original!!!!";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }
}
