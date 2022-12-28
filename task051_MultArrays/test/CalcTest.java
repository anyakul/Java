package task051_MultArrays.test;

import org.junit.Assert;
import org.junit.Test;
import task051_MultArrays.main.services.CalcService;

public class CalcTest {
    @Test
    public void sumWhenTypeIsInteger() throws Exception {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcService<Integer> service = new CalcService<>(arr1, arr2);
        Double[] result = service.MultArrays();
        Assert.assertTrue(result[0] == 3);
        Assert.assertTrue(result[1] == 8);
    }

    @Test
    public void sumWhenTypeIsDouble() throws Exception {
        Double[] arr1 = new Double[] { 1.2, 2.3 };
        Double[] arr2 = new Double[] { 3.3, 4.2 };
        CalcService<Double> service = new CalcService<>(arr1, arr2);
        Double[] result = service.MultArrays();
        Assert.assertTrue(result[0] == 3.96);
        Assert.assertTrue(result[1] == 9.66);
    }
}
