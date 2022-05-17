package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    //Here the spring doesn't knows that it is supposed to inject greetingsService so we use @Autowired
    // Greetings service must be a component like service
    @Qualifier("propertyGreetingService")   //to make sure which bean we want to be injected
    @Autowired
    public GreetingsService greetingsService;
    public String getGreetings(){
        return greetingsService.sayHello();
    }
}
