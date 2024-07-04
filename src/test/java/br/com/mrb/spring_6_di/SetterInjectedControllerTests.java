package br.com.mrb.spring_6_di;

import br.com.mrb.spring_6_di.controller.SetterInjectedControler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SetterInjectedControllerTests {

    @Autowired
    SetterInjectedControler setterInjectedControler;

 /*   @BeforeEach
    void setUp(){
        setterInjectedControler = new SetterInjectedControler();
        setterInjectedControler.setGreetingService(new GreetingServiceImpl());
    }
*/
    @Test
    void sayHello(){
        System.out.println(setterInjectedControler.sayHello());
    }
}
