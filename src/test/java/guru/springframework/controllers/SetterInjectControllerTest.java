package guru.springframework.controllers;


import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by bautisj on 12/11/2017.
 */
public class SetterInjectControllerTest {

    private SetterInjectController setterInjectController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectController = new SetterInjectController();
        this.setterInjectController.setGretingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectController.sayHello());
    }
}
