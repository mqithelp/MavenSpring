package pro.mqithelp.calculator;

import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService {

    @Override
    public String plus(String num1, String num2) {
        if (isPoorData(num1, num2)) return "Не указан один из параметров.";

        Integer res = Integer.parseInt(num1) + Integer.parseInt(num2);
        return "<H1>" + num1 + "+" + num2 + " = " + res.toString();
    }

    @Override
    public String minus(String num1, String num2) {
        if (isPoorData(num1, num2)) return "Не указан один из параметров.";
        Integer res = Integer.parseInt(num1) - Integer.parseInt(num2);
        return "<H1>" + num1 + " - " + num2 + " = " + res.toString();
    }

    @Override
    public String multiply(String num1, String num2) {
        if (isPoorData(num1, num2)) return "Не указан один из параметров.";
        Integer res = Integer.parseInt(num1) * Integer.parseInt(num2);
        return "<H1>" + num1 + " * " + num2 + " = " + res.toString();
    }

    @Override
    public String divide(String num1, String num2) {
        if (isPoorData(num1, num2)) return "Не указан один из параметров.";
        if (num2.equals("0")) {
            return "<H1> Попытка деления на ноль.";
        } else {
            Double res = Double.parseDouble(num1) / Double.parseDouble(num2);
            return "<H1>" + num1 + " / " + num2 + " = " + res.toString();
        }
    }

    public String answerHello() {
        return "<H1>Добро пожаловать в калькулятор!<br>" +
                "<H2>Доступные команды:<br>" +
                "<H2>plus, minus, multiply, divide. <br>" +
                "<p style=\"background-color:Tomato;\"> Пример: /calculator/divide?num1=<b>4</b>&num2=<b>6</b></p> ";
    }

    public boolean isPoorData(String n1, String n2) {
        return (n1.equals("") || n2.equals(""));
    }
}
