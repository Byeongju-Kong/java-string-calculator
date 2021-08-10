package model.operation;

public class Subtraction implements Operation {
    @Override
    public boolean hasOperator(String operator) {
        return operator.equals("-");
    }

    @Override
    public double operate(double result, int nextOperand) {
        return result - nextOperand;
    }
}
