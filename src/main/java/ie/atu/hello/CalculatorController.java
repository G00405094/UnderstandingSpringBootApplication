package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2){

    }

}
