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

    public char getSource() {
        if (operators.size() == 0) {
            throw new IndexOutOfBoundsException("반환할 연산기호가 없습니다.");
        }
        return operators.remove(0).getOperator();
    }
}
