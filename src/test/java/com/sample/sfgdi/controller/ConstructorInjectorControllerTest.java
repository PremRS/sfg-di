package com.sample.sfgdi.controller;

import com.sample.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectorControllerTest {

    ConstructorInjectorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectorController(new PrimaryGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}