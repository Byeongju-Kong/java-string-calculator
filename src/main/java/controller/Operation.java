package controller;

import model.Calculator;
import model.OperationSource;
import view.Input;

public class Operation implements Calculator {

    private OperationSource operationSource;
    private double result;

    public void input() {
        operationSource = new OperationSource(Expression.getExpression(Input.input()));
        result = 0.0;
    }

    public void calculate() {
        result = operationSource.getOperand();

        while (operationSource.hasNextOperation()) {
            int operand = operationSource.getOperand();
            char operator = operationSource.getOperator();//TODO 파싱하는 메서드를 따로 만들자

            if (operator == '+') {//TODO ENUM으로 관리하도록 변경
                result = Addition.operate(result, operand);
            } else if (operator == '-') {
                result = Subtraction.operate(result, operand);
            } else if (operator == '*') {
                result = Multiplication.operate(result, operand);
            } else if (operator == '/') {
                result = Division.operate(result, operand);
            }
        }
    }

    public double getResult() {
        return result;
    }

}
