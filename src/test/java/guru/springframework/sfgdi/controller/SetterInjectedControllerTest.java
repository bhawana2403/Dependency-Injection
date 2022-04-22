package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ContructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingsService(new ContructorGreetingService());
    }
    @Test
    void getGreetingsService() {
        System.out.println(controller.getGreetingsService());
    }
}