package task050_Calculator.main.java.services;

import task050_Calculator.main.java.views.CalcArraysView;

public class CalcArrays<T extends Number> {
    private T[] arr1;
    private T[] arr2;

    public CalcArrays(T[] arr1, T[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public CalcArraysView<T> GetCalcView(String sign) {
        if (arr1.length != arr2.length) {
            return new CalcArraysView<>(true, "Длина массивов должна совпадать", null);
        }
        if (sign.equals("+")) {
            return new CalcArraysView<T>(false, null, SumArrays());
        } else if (sign.equals("-")) {
            return new CalcArraysView<T>(false, null, SubtractArrays());
        } else if (sign.equals("*")) {
            return new CalcArraysView<T>(false, null, MultArrays());
        } else if (sign.equals("/")) {
            return new CalcArraysView<T>(false, null, DivideArrays());
        }

        return null;
    }

    public Double[] SumArrays() {
        Double[] res = new Double[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i].doubleValue() + arr2[i].doubleValue();
        }

        return res;
    }

    public Double[] SubtractArrays() {
        Double[] res = new Double[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = Math.round((arr1[i].doubleValue() - arr2[i].doubleValue()) * 100.0) / 100.0;
        }

        return res;
    }

    public Double[] MultArrays() {
        Double[] res = new Double[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = Math.round(arr1[i].doubleValue() * arr2[i].doubleValue() * 100.0) / 100.0;
        }

        return res;
    }

    public Double[] DivideArrays() {
        Double[] res = new Double[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = Math.round(arr1[i].doubleValue() / arr2[i].doubleValue() * 100.0) / 100.0;
        }

        return res;
    }
}
