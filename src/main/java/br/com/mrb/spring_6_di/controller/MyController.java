package br.com.mrb.spring_6_di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }
}
