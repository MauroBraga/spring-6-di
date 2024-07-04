package br.com.mrb.spring_6_di;

import br.com.mrb.spring_6_di.controller.PropertyInjectedController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyInjectedControllerTests {

    @Autowired
    PropertyInjectedController propertyInjectedController;
/*
    @BeforeEach
    void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }
*/
    @Test
    void sayHello(){
        System.out.println(propertyInjectedController.sayHello());
    }
}
