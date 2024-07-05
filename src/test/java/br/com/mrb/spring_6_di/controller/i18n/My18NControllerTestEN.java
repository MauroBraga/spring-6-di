package br.com.mrb.spring_6_di.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
public class My18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello(){
        System.out.println(myi18NController.sayHello());
    }
}