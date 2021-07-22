package controller;

import model.Calculator;
import view.Input;

public class Operation implements Calculator {

    private model.Operation operation;
    private double result;

    public void input() {
        operation = new model.Operation(Expression.getExpression(Input.input()));
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
