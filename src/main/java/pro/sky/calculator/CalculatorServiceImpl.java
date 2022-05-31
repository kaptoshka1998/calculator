package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public double plus(double a, double b) {
        return (a + b);
    }

    @Override
    public double minus(double a, double b) {
        return (a - b);
    }

    @Override
    public double multiply(double a, double b) {
        return (a * b);
    }

    @Override
    public double divide(double a, double b) {
        return (a / b);
    }
}
