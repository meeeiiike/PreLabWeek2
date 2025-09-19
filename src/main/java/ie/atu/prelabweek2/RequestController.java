package ie.atu.prelabweek2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    // Known text sent through /hello url
    @GetMapping("/sayHello")
    public String hello(){
        return "Hello";
    }

    // Use @PathVariable when the value is an identifier for a specific
    // resource (e.g., user ID, product code).
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name;
    }

    // Use @RequestParam when passing filters, options, or additional
    // data that modifies the request (e.g., search terms, pagination, sorting).
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return "Username: " + name + ", Age: " + age;
    }
}
