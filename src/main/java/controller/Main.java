package controller;

import model.Calculator;
import view.Result;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculation();
        calculator.input();
        calculator.calculate();
        Result.showResult(calculator);
    }
}
