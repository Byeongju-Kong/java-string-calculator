package model.operation;

public interface Operation {
    boolean hasOperator(String operator);
    double operate(double result, int nextOperand);
}
