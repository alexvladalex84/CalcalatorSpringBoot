package pro.sky.alex.calculatorspringboot.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.alex.calculatorspringboot.Exception.InvalidInputParametersException;
import pro.sky.alex.calculatorspringboot.Service.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

//    @ExceptionHandler({InvalidInputParametersException.class,IllegalArgumentException.class})
//    public ResponseEntity<String> handlerException(InvalidInputParametersException e) {
//
//        return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
//
//    }

    @GetMapping
    public String greetings() {
        return calculatorService.greetings();

    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }
}
