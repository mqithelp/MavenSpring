package pro.mqithelp.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService {

    @Override
    public String plus(Integer num1, Integer num2) {
        Integer res = num1 + num2;
        return "<H1>" + num1 + "+" + num2 + " = " + res.toString();
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        Integer res = num1 - num2;
        return "<H1>" + num1 + " - " + num2 + " = " + res.toString();
    }

    @Override
    public String multiply(Integer num1, Integer num2) {

        Integer res = num1 * num2;
        return "<H1>" + num1 + " * " + num2 + " = " + res.toString();
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "<H1> Попытка деления на ноль.";
        } else {
            Double res = (double) (num1 / num2);
            return "<H1>" + num1 + " / " + num2 + " = " + res.toString();
        }
    }

    public String answerHello() {
        return "<H1>Добро пожаловать в калькулятор!<br>" +
                "<H2>Доступные команды:<br>" +
                "<H2>plus, minus, multiply, divide. <br>" +
                "<p style=\"background-color:Tomato;\"> Пример: /calculator/divide?num1=<b>4</b>&num2=<b>6</b></p> ";
    }

}
