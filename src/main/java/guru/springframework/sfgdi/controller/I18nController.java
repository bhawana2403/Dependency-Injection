package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingsService;

@Controller
public class I18nController {
    private GreetingsService greetingsService;
    public I18nController(@Qualifier("i18nService") GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }
    public String getGreetingString(){
        return greetingsService.sayHello();
    }    
    
}
