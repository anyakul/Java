package controllers;

import services.CalculatorService;

public class CalculatorController {
    public void calc() {
        CalculatorService<Integer> calculatorService = new CalculatorService<>();
        int num1 = 100;
        int num2 = 1000;
        System.out.println(calculatorService.sum(num1, num2));

        CalculatorService<Double> calculatorServiceDouble = new CalculatorService<>();
        Double num3 = 4.02;
        Double num4 = 2.9;
        System.out.println(calculatorServiceDouble.sum(num3, num4));
    }
}
