package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingsService = new ConstructorGreetingService();

    }
    @Test
    void sayGreetings() {
        System.out.println(controller.getGreetings());
    }
}