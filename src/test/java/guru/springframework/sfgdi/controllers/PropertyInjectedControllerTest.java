package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by rjamieson on 8/31/21
 *
 * Example of MANUAL property injection - NOT THE WAY TO DO IT
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingServiceImpl();
    }
    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}