package services;

public class CalculatorService<T extends Number> {
    public double sum(T num1, T num2) {
        if (num1 == null || num2 == null) {
            return 0;
        }

        return num1.doubleValue() + num2.doubleValue();
    }

    public double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue() * 100;
    }
}
