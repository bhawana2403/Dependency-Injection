package guru.springframework.sfgdi.services;

public class ConstructorGreetingService implements GreetingsService{
    @Override
    public String sayHello(){
        return  "Hello World - Constructor";
    }
}
