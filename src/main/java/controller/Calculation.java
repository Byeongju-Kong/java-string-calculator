package controller;

import controller.arithmetic.Addition;
import controller.arithmetic.Division;
import controller.arithmetic.Multiplication;
import controller.arithmetic.Subtraction;
import model.Calculator;
import model.OperationSource;

public class Calculation implements Calculator {

    private OperationSource operationSource;
    private double result;

    public void input() {
        operationSource = new OperationSource(Expression.getExpression(Main.Input.input()));
        result = 0.0;
    }

    public void calculate() {
        result = operationSource.getOperand();

        while (operationSource.hasNextOperation()) {
            int operand = operationSource.getOperand();
            char operator = operationSource.getOperator();

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
