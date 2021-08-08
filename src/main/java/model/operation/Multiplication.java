package model.operation;

import model.operator.Operator;

public class Multiplication implements Operation {

    @Override
    public boolean hasOperator(Operator operator) {
        return operator == Operator.TIMES;
    }

    @Override
    public double operate(double result, int nextOperand) {
        return result * nextOperand;
    }
}