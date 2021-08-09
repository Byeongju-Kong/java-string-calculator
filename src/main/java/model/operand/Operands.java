package model.operand;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Operands {
    private Queue<Operand> operands;
    private static final int START_ENTRY = 0;

    public Operands(String[] operationSource) {
        operands = new LinkedList<>();
        IntStream.range(START_ENTRY, operationSource.length)
                .filter(this::isEvenNumber)
                .forEach(index -> operands.add(new Operand(operationSource[index])));
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public int getSource() {
        if (operands.size() == 0) {
            throw new IndexOutOfBoundsException("반환할 숫자가 없습니다.");
        }
        return operands.remove().getOperand();
    }
}
