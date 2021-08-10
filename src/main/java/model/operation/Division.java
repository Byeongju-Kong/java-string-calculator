package model.operation;

public class Division implements Operation{
    @Override
    public boolean hasOperator(String operator) {
        return operator.equals("/");
    }

    @Override
    public double operate(double result, int nextOperand) {
        if(nextOperand == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return result / nextOperand;
    }
}
