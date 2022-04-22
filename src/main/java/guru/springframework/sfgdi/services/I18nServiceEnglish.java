package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nServiceEnglish implements GreetingsService{
    @Override
    public String sayHello(){
        return "Greetings from I18nEnglish Server";
    }
    
}
