package br.com.mrb.spring_6_di.controller;

import br.com.mrb.spring_6_di.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
