package com.sample.sfgdi.controller;

import com.sample.sfgdi.services.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectorControllerTest {

    SetterInjectorController setterInjectorController;

    @BeforeEach
    void setUp() {
        setterInjectorController = new SetterInjectorController();
        setterInjectorController.setGreetingService(new PrimaryGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectorController.getGreeting());
    }
}