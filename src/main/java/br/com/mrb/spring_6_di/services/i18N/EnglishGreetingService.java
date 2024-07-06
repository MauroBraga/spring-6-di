package br.com.mrb.spring_6_di.services.i18N;

import br.com.mrb.spring_6_di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService  implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
