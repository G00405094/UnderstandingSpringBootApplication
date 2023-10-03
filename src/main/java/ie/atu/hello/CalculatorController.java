package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public int calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation){
        if (operation.equals("add")) {
            return num1 + num2;
        } else if (operation.equals("multiply")) {
            return num1 * num2;
        } else if (operation.equals("subtract")) {
            return num1 - num2;
        } else if (operation.equals("divide")) {
            return num1/num2;
        }
        return 0;
    }

}
