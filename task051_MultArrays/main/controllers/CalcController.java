package task051_MultArrays.main.controllers;

import task051_MultArrays.main.services.CalcService;
import task051_MultArrays.main.views.CalcView;

public class CalcController {
    public void multArrays() {
        Integer[] arr1 = new Integer[] { 1, 23, 86 };
        Integer[] arr2 = new Integer[] { 45, 10, 34 };
        CalcService<Integer> calcService1 = new CalcService<>(arr1, arr2);
        CalcView<Integer> calcView1 = calcService1.GetCalcView();
        calcView1.printList();

        Double[] arr3 = new Double[] { 1.23, 23.2, 86.2 };
        Double[] arr4 = new Double[] { 45.1, 10.56, 34.3 };
        CalcService<Double> calcService2 = new CalcService<>(arr3, arr4);
        CalcView<Double> calcView2 = calcService2.GetCalcView();
        calcView2.printList();
    }
}
