package task051_MultArrays.main.services;

import task051_MultArrays.main.views.CalcView;

public class CalcService<T extends Number> {
    private T[] arr1;
    private T[] arr2;

    public CalcService(T[] arr1, T[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public CalcView<T> GetCalcView() {
        if (arr1.length != arr2.length) {
            return new CalcView<>(true, "Длина массивов должна совпадать", null);
        } else {
            return new CalcView<T>(false, null, MultArrays());
        }
    }

    public Double[] MultArrays() {
        Double[] res = new Double[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i].doubleValue() * arr2[i].doubleValue();
        }

        return res;
    }
}
