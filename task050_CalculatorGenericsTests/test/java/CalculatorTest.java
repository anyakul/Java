package task050_CalculatorGenericsTests.test.java;

import org.junit.Assert;
import org.junit.Test;
import services.CalculatorService;

public class CalculatorTest {
    @Test
    public void sumWhenTypeIsInteger() {
        CalculatorService<Integer> service = new CalculatorService<>();
        double result = service.sum(1, 2);
        Assert.assertTrue(result == 3);
    }

    @Test
    public void sumWhenTypeIsDouble() {
        CalculatorService<Double> service = new CalculatorService<>();
        Double result = service.sum(1.2, 2.3);
        Assert.assertTrue(result == 3.5);
    }
}
