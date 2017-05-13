package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/hi")
    public String index() {
        return "Hi Sunny, Greetings from Spring Boot! ";
    }
    
}
