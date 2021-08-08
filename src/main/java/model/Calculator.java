package model;

import controller.Expression;
import controller.Input;
import model.Operand.Operands;
import model.Operator.Operators;

public class Calculator {
    private Operands operands;
    private Operators operators;
    private Operation operation;
    private int timesOfOperation;
    private double result;

    public void input() {
        String[] operationSource = Expression.getValidExpression(Input.input());
        timesOfOperation = operationSource.length / 2;
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
    }

    private boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    public void calculate() {
        result = operands.getSource();

        while (hasNextOperation()) {
            parseOperator(operators.getSource());
            result = operation.operate(result, operands.getSource());
            timesOfOperation--;
        }
    }

    public void parseOperator(char operator) {
        if (operator == '+') {
            operation = Operation.PLUS;
        } else if (operator == '-') {
            operation = Operation.MINUS;
        } else if (operator == '*') {
            operation = Operation.TIMES;
        } else if (operator == '/') {
            operation = Operation.DIVIDE;
        }
    }

    public double getResult() {
        return result;
    }
}
