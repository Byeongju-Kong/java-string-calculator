package model.operation;

import model.operator.Operator;

public interface Operation {
    boolean hasOperator(Operator operator);
    double operate(double result, int nextOperand);
}
