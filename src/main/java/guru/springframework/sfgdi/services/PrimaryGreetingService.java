package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingsService{
    @Override
    public String sayHello(){
        return  "Hello World - Primary Bean";
    }
}
