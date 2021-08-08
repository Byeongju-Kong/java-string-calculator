package model.operator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;


public class Operators {
    private Queue<Operator> operators;
    private static final int START_ENTRY = 0;

    public Operators(String[] operationSource) {
        operators = new LinkedList<>();
        IntStream.range(START_ENTRY, operationSource.length)
                .filter(this::isOddNumber)
                .forEach(index -> operators.add(Operator.of(operationSource[index].charAt(0))));
    }

    private boolean isOddNumber(int number) {
        return number % 2 == 1;
    }

    public char getSource() {
        return operators.remove().getOperator();
    }
}
