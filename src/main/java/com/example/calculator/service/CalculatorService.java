package com.example.calculator.service;

import com.example.calculator.model.CalculatorInput;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(CalculatorInput input) {
        switch (input.getOperation().toLowerCase()) {
            case "add": return input.getNum1() + input.getNum2();
            case "subtract": return input.getNum1() - input.getNum2();
            case "multiply": return input.getNum1() * input.getNum2();
            case "divide":
                if (input.getNum2() == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return input.getNum1() / input.getNum2();
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}
