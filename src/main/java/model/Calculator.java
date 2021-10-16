package model;

import model.operand.Operands;
import model.operation.Operation;
import model.operator.Operators;

import static model.operation.Operations.findOperation;

public class Calculator {
    private final Operands operands;
    private final Operators operators;
    private int timesOfOperation;
    private double result;

    public Calculator(final String[] operationSource) {
        timesOfOperation = operationSource.length / 2;
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
    }

    private boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    private void calculate() {
        result = operands.getSource();
        String operator;
        Operation operation;

        while (hasNextOperation()) {
            operator = operators.getSource();
            operation = findOperation(operator);
            result = operation.operate(result, operands.getSource());
            timesOfOperation--;
        }
    }

    public double getResult() {
        calculate();
        return result;
    }
}
