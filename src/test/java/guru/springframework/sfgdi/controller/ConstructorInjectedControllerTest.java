package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.ContructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ContructorGreetingService());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}