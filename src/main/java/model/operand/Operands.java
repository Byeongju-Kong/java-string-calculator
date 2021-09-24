package model.operand;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Operands {
    private static final int START_ENTRY = 0;
    private final Queue<Operand> numbers;

    public Operands(String[] operationSource) {
        numbers = parseOperand(operationSource);
    }

    private Queue<Operand> parseOperand(String[] operationSource) {
        Queue<Operand> operands = new LinkedList<>();
        IntStream.range(START_ENTRY, operationSource.length)
                .filter(this::isEvenNumber)
                .forEach(index -> operands.add(new Operand(operationSource[index])));
        return operands;
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public int getSource() {
        if (numbers.size() == 0) {
            throw new IndexOutOfBoundsException("반환할 숫자가 없습니다.");
        }
        return numbers.remove().getOperand();
    }
}
