package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rjamieson on 9/1/21
 */
@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter Injected";
    }
}
