package hello.services;

import org.springframework.stereotype.Service;

@Service("GreetingService")
public class GreetingService {
    public String hello() {
        return "great";
    }
}
