package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nServiceSpanish implements GreetingsService{
    @Override
    public String sayHello(){
        return "Greetings from I18nSpanish Server";
    }
    
}
