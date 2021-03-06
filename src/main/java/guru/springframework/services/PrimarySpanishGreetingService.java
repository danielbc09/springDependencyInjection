package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by bautisj on 12/13/2017.
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Servicio de saludo Primario XD";
    }
}
