package model.operation;

import model.operator.Operator;

public class Division implements Operation{

    @Override
    public boolean hasOperation(Operator operator) {
        return operator == Operator.DIVIDED_BY;
    }

    @Override
    public double operate(double result, int nextOperand) {
        if(nextOperand == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return result / nextOperand;
    }
}
