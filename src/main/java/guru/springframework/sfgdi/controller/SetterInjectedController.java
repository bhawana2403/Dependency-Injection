package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingsService;

@Controller
public class SetterInjectedController {
    
    private GreetingsService greetingsService;
    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }
    public String getGreetingsService(){
        return this.greetingsService.sayHello();
    }

}
