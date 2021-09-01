package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by rjamieson on 8/31/21
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor Injected";
    }
}
