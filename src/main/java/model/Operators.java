package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static model.Operation.START_ENTRY;

public class Operators {
    private List<Operator> operators;

    public Operators(List<String> operationSource) {
        operators = new ArrayList<>();
        IntStream.range(START_ENTRY, operationSource.size())
                .filter(this::isOddNumber)
                .forEach(index -> operators.add(new Operator(operationSource.get(index))));
    }

    private boolean isOddNumber(int number) {
        return number % 2 == 1;
    }

    public double operate(double result, double operand) {
        char operator = operators.remove(0).getOperator();
        if(operator == '/' && operand == '0'){
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }

        if(operator == '+'){
            return result + operand;
        }
        else if(operator == '-'){
            return result - operand;
        }
        else if(operator == '*'){
            return result * operand;
        }
        return result / operand;
    }
}
