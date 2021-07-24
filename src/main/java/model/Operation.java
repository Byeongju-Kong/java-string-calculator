package model;

import controller.Expression;
import controller.Input;

import java.util.List;

public class Operation implements Calculator {
    private Operands operands;
    private Operators operators;
    private int timesOfOperation;
    private List<String> operationSource;
    private double result;


    public Operation() {
    }

    private boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    public void input() {
        operationSource = Expression.getExpression(Input.input());
        timesOfOperation = operationSource.size() / 2;
    }

    public void calculate() {
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
        result = operands.getSource();

        while (hasNextOperation()) {
            result = operators.operate(result, operands.getSource());
        }
    }

    public double getResult() {
        return result;
    }

}
