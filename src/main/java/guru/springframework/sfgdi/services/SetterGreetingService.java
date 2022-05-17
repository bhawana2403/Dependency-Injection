package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;


public class SetterGreetingService implements GreetingsService{
    @Override
    public String sayHello(){
        return  "Hello World - Setter";
    }
}
