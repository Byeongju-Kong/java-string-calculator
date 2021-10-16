package model.operation;

public class Addition implements Operation {
    @Override
    public boolean hasOperator(final String operator) {
        return operator.equals("+");
    }

    @Override
    public double operate(final double result, final int nextOperand) {
        return result + nextOperand;
    }
}
