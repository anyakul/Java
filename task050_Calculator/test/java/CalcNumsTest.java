package task050_Calculator.test.java;

import org.junit.Assert;
import org.junit.Test;
import task050_Calculator.main.java.services.CalcNums;

public class CalcNumsTest {
    @Test
    public void sumWhenTypeIsInteger() {
        CalcNums<Integer> service = new CalcNums<>(3, 2);
        double result = service.sum();
        Assert.assertTrue(result == 5.0);
    }

    @Test
    public void subtractWhenTypeIsInteger() {
        CalcNums<Integer> service = new CalcNums<>(3, 2);
        double result = service.subtract();
        Assert.assertTrue(result == 1.0);
    }

    @Test
    public void multiplyWhenTypeIsInteger() {
        CalcNums<Integer> service = new CalcNums<>(3, 2);
        double result = service.multiply();
        Assert.assertTrue(result == 6.0);
    }

    @Test
    public void divideWhenTypeIsInteger() {
        CalcNums<Integer> service = new CalcNums<>(3, 2);
        double result = service.divide();
        Assert.assertTrue(result == 1.5);
    }

    @Test
    public void sumWhenTypeIsDouble() {
        CalcNums<Double> service = new CalcNums<>(1.2, 2.3);
        Double result = service.sum();
        Assert.assertTrue(result == 3.5);
    }

    @Test
    public void subtractWhenTypeIsDouble() {
        CalcNums<Double> service = new CalcNums<>(1.2, 2.3);
        Double result = service.subtract();
        Assert.assertTrue(result == -1.1);
    }

    @Test
    public void multiplyWhenTypeIsDouble() {
        CalcNums<Double> service = new CalcNums<>(1.2, 2.3);
        Double result = service.multiply();
        Assert.assertTrue(result == 2.76);
    }

    @Test
    public void divideWhenTypeIsDouble() {
        CalcNums<Double> service = new CalcNums<>(1.2, 2.3);
        Double result = service.divide();
        Assert.assertTrue(result == 0.52);
    }
}
