package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    @GetMapping("/calculate")
    public int calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
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
