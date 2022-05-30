package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(double a, double b) {
        return a + " + " + b + " = " + (a+b);
    }
    @Override
    public String minus(double a, double b) {
        return a + " + " + b + " = " + (a-b);
    }
    @Override
    public String multiply(double a, double b) {
        return a + " * " + b + " = " + (a*b);
    }
    @Override
    public String divide(double a, double b) {
        if (b != 0) {
            return a + " + " + b + " = " + (a / b);
        } else {
            return "Атата! На ноль делить нельзя...";
        }
    }
}
