package controller;

import model.Calculator;
import view.Result;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Operation();
        calculator.input();
        calculator.calculate();
        Result.showResult(calculator);
    }
}
