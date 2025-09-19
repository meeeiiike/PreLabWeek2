package ie.atu.prelabweek2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RequestController {

    // Known text sent through /hello url
    @GetMapping("/sayHello")
    public String hello() {
        return "Hello";
    }

    // Use @PathVariable when the value is an identifier for a specific
    // resource (e.g., user ID, product code).
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }

    // Use @RequestParam when passing filters, options, or additional
    // data that modifies the request (e.g., search terms, pagination, sorting).
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Username: " + name + ", Age: " + age;
    }

    // Returns JSON as opposed to strings like last methods.
    // this endpoint/methods calls the person constructor passing the values
    @GetMapping("/person")
    public Person getPerson() {
        return new Person("Meike", 23);
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation) {

        switch (operation) {
            case "add":
                double sumAdd = num1 + num2;
                return "Total: " + sumAdd;
            case "subtract":
                double sumSub = num1 - num2;
                return "Total: " + sumSub;
            case "multiply":
                double sumMultiply = num1 * num2;
                return "Total: " + sumMultiply;
            case "divide":
                if (num2 == 0) {
                    return "Division by zero";
                } else {
                    double sumDivide = num1 / num2;
                    return "Total: " + sumDivide;
                }
        }
        return operation;
    }
}
