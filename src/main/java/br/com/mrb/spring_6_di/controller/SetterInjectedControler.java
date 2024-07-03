package br.com.mrb.spring_6_di.controller;

import br.com.mrb.spring_6_di.services.GreetingService;

public class SetterInjectedControler {
    private  GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
