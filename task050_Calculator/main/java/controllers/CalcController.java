package task050_Calculator.main.java.controllers;

import task050_Calculator.main.java.services.CalcArrays;
import task050_Calculator.main.java.services.CalcNums;
import task050_Calculator.main.java.views.CalcArraysView;

public class CalcController {
    public void calc() {
        int num1 = 3;
        int num2 = 2;
        CalcNums<Integer> calcNums = new CalcNums<>(num1, num2);
        System.out.println(calcNums.sum());
        System.out.println(calcNums.subtract());
        System.out.println(calcNums.multiply());
        System.out.println(calcNums.divide());

        Double num3 = 1.2;
        Double num4 = 2.3;
        CalcNums<Double> calcNums2 = new CalcNums<>(num3, num4);
        System.out.println(calcNums2.sum());
        System.out.println(calcNums2.subtract());
        System.out.println(calcNums2.multiply());
        System.out.println(calcNums2.divide());
    }

    public void calcArrays() {
        Integer[] arr1 = new Integer[] { 1, 2 };
        Integer[] arr2 = new Integer[] { 3, 4 };
        CalcArrays<Integer> calcArrays = new CalcArrays<>(arr1, arr2);
        CalcArraysView<Integer> calcSumView = calcArrays.GetCalcView("+");
        calcSumView.printList();
        CalcArraysView<Integer> calcSubtractView = calcArrays.GetCalcView("-");
        calcSubtractView.printList();
        CalcArraysView<Integer> calcMultView = calcArrays.GetCalcView("*");
        calcMultView.printList();
        CalcArraysView<Integer> calcDivideView = calcArrays.GetCalcView("/");
        calcDivideView.printList();

        Double[] arr3 = new Double[] { 1.2, 2.3 };
        Double[] arr4 = new Double[] { 3.4, 4.5 };
        CalcArrays<Double> calcArrays2 = new CalcArrays<>(arr3, arr4);
        CalcArraysView<Double> calcSumView2 = calcArrays2.GetCalcView("+");
        calcSumView2.printList();
        CalcArraysView<Double> calcSubtractView2 = calcArrays2.GetCalcView("-");
        calcSubtractView2.printList();
        CalcArraysView<Double> calcMultView2 = calcArrays2.GetCalcView("*");
        calcMultView2.printList();
        CalcArraysView<Double> calcDivideView2 = calcArrays2.GetCalcView("/");
        calcDivideView2.printList();
    }
}
