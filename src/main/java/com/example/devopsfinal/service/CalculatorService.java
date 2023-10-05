package com.example.devopsfinal.service;

import com.example.devopsfinal.calculator.Calculator;
import com.example.devopsfinal.request.CalculateRequest;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final Calculator calculator = new Calculator();

    public double calculate(CalculateRequest request) {
        return calculator.calculate(request.x(), request.y(), request.operand());
    }

}
