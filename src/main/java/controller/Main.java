package controller;

import model.Calculator;
import view.Display;

import static controller.Input.input;
import static model.ExpressionToken.getValidExpressionTokens;

public class Main {
    public static void main(String[] args) {
        Display.alertInput();
        Calculator calculator = new Calculator(getValidExpressionTokens(input()));
        Display.showResult(calculator);
    }
}
