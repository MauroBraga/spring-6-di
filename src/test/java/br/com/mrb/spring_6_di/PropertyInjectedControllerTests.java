package br.com.mrb.spring_6_di;

import br.com.mrb.spring_6_di.controller.PropertyInjectedController;
import br.com.mrb.spring_6_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTests {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello(){
        System.out.println(propertyInjectedController.sayHello());
    }
}
