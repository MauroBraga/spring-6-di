package br.com.mrb.spring_6_di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GretingServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from the primary Bean!!";
    }
}
