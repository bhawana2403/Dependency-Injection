package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingsService(new ConstructorGreetingService());
    }
    @Test
    void getGreetingsService() {
        System.out.println(controller.getGreetingsService());
    }
}