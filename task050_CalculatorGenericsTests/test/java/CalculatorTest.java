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
}
