package guru.springframework.sfgdi.services;


import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

public class I18nServiceEnglish implements GreetingsService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nServiceEnglish(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayHello(){
        return "Greetings from I18nEnglish Server";
    }
    
}
