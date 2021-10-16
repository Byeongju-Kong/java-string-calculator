package model.operation;

public class Division implements Operation{
    @Override
    public boolean hasOperator(final String operator) {
        return operator.equals("/");
    }

    @Override
    public double operate(final double result, final int nextOperand) {
        if(nextOperand == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return result / nextOperand;
    }
}
