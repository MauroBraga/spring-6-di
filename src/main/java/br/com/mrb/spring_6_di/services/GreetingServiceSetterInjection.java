package br.com.mrb.spring_6_di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBran")
public class GreetingServiceSetterInjection implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }
}
