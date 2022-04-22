package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ContructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingsService = new ContructorGreetingService();

    }
    @Test
    void sayGreetings() {
        System.out.println(controller.getGreetings());
    }
}