package controller;

import model.Calculator;
import view.Result;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Result.alertInput();
        calculator.input();
        calculator.calculate();
        Result.showResult(calculator);
    }
}
