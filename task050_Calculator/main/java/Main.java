package task050_Calculator.main.java;

import task050_Calculator.main.java.controllers.CalcController;

public class Main {
    public static void main(String[] args) {
        CalcController calcController = new CalcController();
        calcController.calc();
        calcController.calcArrays();
    }
}
