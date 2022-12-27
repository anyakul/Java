package controllers;

import services.CalculatorService;

public class CalculatorController {
    public void calc() {
        CalculatorService<Integer> calculatorService = new CalculatorService<>();
        int num1 = 100;
        int num2 = 1000;
        System.out.println(calculatorService.sum(num1, num2));
    }
}
