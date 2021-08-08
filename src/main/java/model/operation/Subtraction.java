package model.operation;

import model.operator.Operator;

public class Subtraction implements Operation {
    @Override
    public boolean hasOperator(Operator operator) {
        return operator == Operator.MINUS;
    }

    @Override
    public double operate(double result, int nextOperand) {
        return result - nextOperand;
    }
}
