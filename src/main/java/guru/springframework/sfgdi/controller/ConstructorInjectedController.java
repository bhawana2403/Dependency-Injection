package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingsService;
@Controller
public class ConstructorInjectedController {
    //We don't need to specify explicitly @Autowired
    private final GreetingsService greetingsService;

    public ConstructorInjectedController(@Qualifier("contructorGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    public String getGreetings(){
        return greetingsService.sayHello();
    }
}
