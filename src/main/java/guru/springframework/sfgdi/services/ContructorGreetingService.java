package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingService implements GreetingsService{
    @Override
    public String sayHello(){
        return  "Hello World - Constructor";
    }
}