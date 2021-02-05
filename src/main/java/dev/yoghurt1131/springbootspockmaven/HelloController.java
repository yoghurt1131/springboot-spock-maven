package dev.yoghurt1131.springbootspockmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, Spock";
    }
}
