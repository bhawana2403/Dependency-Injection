package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingsService;

@Controller
public class MyController {
    private final GreetingsService greetingsService;
    public MyController(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

    public String getGreetings(){
        return greetingsService.sayHello();
    }
}
