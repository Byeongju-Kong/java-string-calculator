package model.operation;

public interface Operation {
    boolean hasOperator(final String operator);
    double operate(final double result, final int nextOperand);
}
