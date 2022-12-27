package task051_MultArrays.tests;

import org.junit.Assert;
import org.junit.Test;
import task051_MultArrays.main.services.CalcService;

public class CalcTest {
    @Test
    public void sumWhenTypeIsInteger() {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcService<Integer> service = new CalcService<>(arr1, arr2);
        Double[] result = service.MultArrays();
        Assert.assertTrue(result[0] == 3);
        Assert.assertTrue(result[1] == 8);
    }
}
