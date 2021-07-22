package model;

import controller.Expression;
import controller.Input;

import java.util.List;

public class Operation implements Calculator {
    static final int START_ENTRY = 0;
    private final Operands operands;
    private final Operators operators;
    private int timesOfOperation;
    private double result;


    public Operation() {
        List<String> operationSource = input();
        timesOfOperation = operationSource.size() / 2;
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
        result = operands.getSource();
    }

    private boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    public List<String> input() {
        return Expression.getExpression(Input.input());
    }

    public void calculate() {
        while (hasNextOperation()) {
            result = operators.operate(result, operands.getSource());
        }
    }

    public double getResult() {
        return result;
    }

}
