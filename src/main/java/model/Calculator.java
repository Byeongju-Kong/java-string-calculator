package model;

import model.operand.Operands;
import model.operation.Operation;
import model.operator.Operators;

import static model.operation.Operations.findOperation;

public class Calculator {
    private final Operands operands;
    private final Operators operators;
    private final OperationTimes operationTimes;
    private double result;

    public Calculator(final String[] operationSource) {
        int timesOfOperation = operationSource.length / 2;
        operationTimes = new OperationTimes(timesOfOperation);
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
    }

    private boolean hasNextOperation() {
        return operationTimes.hasLeftTimes();
    }

    private void calculate() {
        result = operands.getSource();
        String operator;
        Operation operation;

        while (hasNextOperation()) {
            operator = operators.getSource();
            operation = findOperation(operator);
            result = operation.operate(result, operands.getSource());
            operationTimes.decrease();
        }
    }

    public double getResult() {
        calculate();
        return result;
    }
}
