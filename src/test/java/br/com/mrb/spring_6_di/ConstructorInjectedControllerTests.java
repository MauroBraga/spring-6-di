package br.com.mrb.spring_6_di;

import br.com.mrb.spring_6_di.controller.ConstructorInjectedControler;
import br.com.mrb.spring_6_di.controller.SetterInjectedControler;
import br.com.mrb.spring_6_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTests {

    ConstructorInjectedControler constructorInjectedController;

    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedControler(new GreetingServiceImpl());
    }

    @Test
    void sayHello(){
        System.out.println(constructorInjectedController.sayHello());
    }
}
