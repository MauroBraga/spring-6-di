package br.com.mrb.spring_6_di.controller;

import br.com.mrb.spring_6_di.services.GreetingService;

public class ConstructorInjectedControler {
    private final  GreetingService greetingService;

    public ConstructorInjectedControler(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
