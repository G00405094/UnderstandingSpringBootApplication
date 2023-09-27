package ie.atu.hello;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String greetByName(@PathVariable String name){
        return "Hello " + name;
    }
}
