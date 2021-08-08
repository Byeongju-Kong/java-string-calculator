package model.operation;

import model.operator.Operator;

public class Addition implements Operation{

    @Override
    public boolean hasOperation(Operator operator) {
        return operator == Operator.PLUS;
    }

    @Override
    public double operate(double result, int nextOperand) {
        return result + nextOperand;
    }
}
