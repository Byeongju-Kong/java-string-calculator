package model;

import controller.Expression;
import controller.Input;

public class Calculator {
    private Operands operands;
    private Operators operators;
    private int timesOfOperation;
    private String[] operationSource;
    private double result;


    public Operation() {
    }

    private boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    public void input() {
        String[] operationSource = Input.input();
        if (Expression.isValidExpression(operationSource)) {
            timesOfOperation = operationSource.length / 2;
        }
        this.operationSource = operationSource;
    }

    public void calculate() {
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
        result = operands.getSource();

//        while (hasNextOperation()) {
//
//        }
    }

    public double getResult() {
        return result;
    }

}
