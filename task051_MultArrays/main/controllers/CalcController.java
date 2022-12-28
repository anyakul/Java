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

        Double[] arr3 = new Double[] { 1.2, 2.3 };
        Double[] arr4 = new Double[] { 3.3, 4.2 };
        CalcService<Double> calcService2 = new CalcService<>(arr3, arr4);
        CalcView<Double> calcView2 = calcService2.GetCalcView();
        calcView2.printList();
    }
}
