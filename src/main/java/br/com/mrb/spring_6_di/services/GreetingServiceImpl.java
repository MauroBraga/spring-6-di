package br.com.mrb.spring_6_di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service !!!";
    }
}
