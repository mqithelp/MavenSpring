package pro.mqithelp.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path =  "/calculator")
public class CalcController {

    private final CalculatorService calculator;

    public CalcController(CalculatorService calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/")
    public String answerHello() {
        return calculator.answerHello();
    }

    @GetMapping("/plus")
    public String calculatorPlus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculator.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String calculatorMinus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculator.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String calculatorMultiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculator.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String calculatorDivide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return calculator.divide(num1, num2);
    }


}
