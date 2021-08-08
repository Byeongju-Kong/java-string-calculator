package model.operation;

import model.operator.Operator;

public interface Operation {
    boolean hasOperation(Operator operator);
    double operate(double result, int nextOperand);
}
