package guru.springframework.sfgdi.config;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfiguration {
    @Profile({"EN","default"})
    @Bean("i18nService")
    I18nServiceEnglish i18nServiceEnglish(EnglishGreetingRepository englishGreetingRepository){
        return new I18nServiceEnglish(englishGreetingRepository);
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("ES")
    I18nServiceSpanish i18nService(){
        return new I18nServiceSpanish();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }
    @Bean
    ContructorGreetingService contructorGreetingService(){
        return new ContructorGreetingService();
    }
    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
    }

}
