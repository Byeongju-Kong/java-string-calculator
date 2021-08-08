package controller;

import view.Display;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Display.alertInput();
        calculator.input();
        calculator.calculate();
        Display.showResult(calculator);
    }
}
