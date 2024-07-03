package br.com.mrb.spring_6_di;

import br.com.mrb.spring_6_di.controller.PropertyInjectedController;
import br.com.mrb.spring_6_di.controller.SetterInjectedControler;
import br.com.mrb.spring_6_di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTests {

    SetterInjectedControler setterInjectedControler;

    @BeforeEach
    void setUp(){
        setterInjectedControler = new SetterInjectedControler();
        setterInjectedControler.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello(){
        System.out.println(setterInjectedControler.sayHello());
    }
}
