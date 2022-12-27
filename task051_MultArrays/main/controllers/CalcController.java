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
    }
}
