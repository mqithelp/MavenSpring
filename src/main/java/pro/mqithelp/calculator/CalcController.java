package pro.mqithelp.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private final CalculatorService calculator;

    public CalcController(Calculator calculator) {
        this.calculator = calculator;
    }

    @RequestMapping(path = {"/", "/calculator"})
    public String answerHello() {
        return calculator.answerHello();
    }

    @GetMapping("/calculator/plus")
    public String calculatorPlus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculator.plus(num1, num2);
    }

    @GetMapping("/calculator/minus")
    public String calculatorMinus(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculator.minus(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    public String calculatorMultiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculator.multiply(num1, num2);
    }

    @GetMapping("/calculator/divide")
    public String calculatorDivide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
        return calculator.divide(num1, num2);
    }


}
