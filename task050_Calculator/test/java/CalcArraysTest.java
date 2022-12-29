package task050_Calculator.test.java;

import org.junit.Assert;
import org.junit.Test;

import task050_Calculator.main.java.services.CalcArrays;

public class CalcArraysTest {
    @Test
    public void sumWhenTypeIsInteger() throws Exception {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcArrays<Integer> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.SumArrays();
        Assert.assertTrue(result[0] == 4.0);
        Assert.assertTrue(result[1] == 6.0);
    }

    @Test
    public void substractWhenTypeIsInteger() throws Exception {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcArrays<Integer> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.SubtractArrays();
        Assert.assertTrue(result[0] == -2.0);
        Assert.assertTrue(result[1] == -2.0);
    }

    @Test
    public void multWhenTypeIsInteger() throws Exception {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcArrays<Integer> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.MultArrays();
        Assert.assertTrue(result[0] == 3.0);
        Assert.assertTrue(result[1] == 8.0);
    }

    @Test
    public void divideWhenTypeIsInteger() throws Exception {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcArrays<Integer> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.DivideArrays();
        Assert.assertTrue(result[0] == 0.33);
        Assert.assertTrue(result[1] == 0.5);
    }

    @Test
    public void sumWhenTypeIsDouble() throws Exception {
        Double[] arr1 = new Double[] { 1.2, 2.3 };
        Double[] arr2 = new Double[] { 3.4, 4.5 };
        CalcArrays<Double> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.SumArrays();
        Assert.assertTrue(result[0] == 4.6);
        Assert.assertTrue(result[1] == 6.8);
    }

    @Test
    public void substractWhenTypeIsDouble() throws Exception {
        Double[] arr1 = new Double[] { 1.2, 2.3 };
        Double[] arr2 = new Double[] { 3.4, 4.5 };
        CalcArrays<Double> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.SubtractArrays();
        Assert.assertTrue(result[0] == -2.2);
        Assert.assertTrue(result[1] == -2.2);
    }

    @Test
    public void multWhenTypeIsDouble() throws Exception {
        Double[] arr1 = new Double[] { 1.2, 2.3 };
        Double[] arr2 = new Double[] { 3.4, 4.5 };
        CalcArrays<Double> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.MultArrays();
        Assert.assertTrue(result[0] == 4.08);
        Assert.assertTrue(result[1] == 10.35);
    }

    @Test
    public void DivideWhenTypeIsDouble() throws Exception {
        Double[] arr1 = new Double[] { 1.2, 2.3 };
        Double[] arr2 = new Double[] { 3.4, 4.5 };
        CalcArrays<Double> service = new CalcArrays<>(arr1, arr2);
        Double[] result = service.DivideArrays();
        Assert.assertTrue(result[0] == 0.35);
        Assert.assertTrue(result[1] == 0.51);
    }
}
