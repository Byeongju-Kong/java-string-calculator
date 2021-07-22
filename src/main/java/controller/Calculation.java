package controller;

import controller.arithmetic.Addition;
import controller.arithmetic.Division;
import controller.arithmetic.Multiplication;
import controller.arithmetic.Subtraction;
import model.Calculator;
import model.Operation;

public class Calculation implements Calculator {

    private Operation operation;
    private double result;

    public void input() {
        operation = new Operation(Expression.getExpression(Input.input()));
        result = 0.0;
    }

    public void calculate() {
        result = operation.getOperand();

        while (operation.hasNextOperation()) {
            int operand = operation.getOperand();
            char operator = operation.getOperator();

            if (operator == '+') {//TODO ENUM으로 관리하도록 변경
                result = Addition.operate(result, operand);
            } else if (operator == '-') {
                result = Subtraction.operate(result, operand);
            } else if (operator == '*') {
                result = Multiplication.operate(result, operand);
            } else if (operator == '/') {
                result = Division.operate(result, operand);
            }
        }
    }

    public double getResult() {
        return result;
    }

}
