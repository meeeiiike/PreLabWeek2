package ie.atu.prelabweek2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    // Known text sent through /hello url
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    // Using path variable, uses part of url for method
    // parameter and will be sent back and stored in a variable
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name;
    }
}
