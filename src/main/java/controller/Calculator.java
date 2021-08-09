package controller;

import model.ExpressionToken;
import model.operand.Operands;
import model.operation.Operation;
import model.operator.Operator;
import model.operator.Operators;

import static model.operation.Operations.findOperation;

public class Calculator {
    private Operands operands;
    private Operators operators;
    private int timesOfOperation;
    private double result;

    public void input() {
        String[] operationSource = ExpressionToken.getValidExpressionTokens(Input.input());
        timesOfOperation = operationSource.length / 2;
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
    }

    private boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    public void calculate() {
        result = operands.getSource();
        Operator operator;
        Operation operation;

        while (hasNextOperation()) {
            operator = operators.getSource();
            operation = findOperation(operator);
            result = operation.operate(result, operands.getSource());
            timesOfOperation--;
        }
    }

    public double getResult() {
        return result;
    }
}
