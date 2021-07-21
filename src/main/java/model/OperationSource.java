package model;

import java.util.List;
import java.util.stream.IntStream;

public class OperationSource {
    private static final int START_ENTRY = 0;
    private static final int MIN_OPERATION_SOURCE_SIZE = 3;
    private final Operand operand;
    private final Operator operator;
    private int timesOfOperation;

    public OperationSource(List<String> operationSource) {
        timesOfOperation = operationSource.size() / 2;

        if (isInvalidSize(operationSource.size())) {
            throw new IllegalStateException("연산식이 완벽하지 않습니다.");
        }
        operand = new Operand();
        operator = new Operator();

        setOperand(operationSource);
        setOperator(operationSource);
    }

    private boolean isEvenNumber(int index) {
        return index % 2 == 0;
    }

    private boolean isOddNumber(int index) {
        return index % 2 == 1;
    }

    private boolean isInvalidSize(int size) {
        return isEvenNumber(size) || size < MIN_OPERATION_SOURCE_SIZE;
    }

    private void setOperand(List<String> operationSource) {
        IntStream.range(START_ENTRY, operationSource.size())
                .filter(this::isEvenNumber)
                .forEach(n -> operand.add(operationSource.get(n)));
    }

    private void setOperator(List<String> operationSource) {
        IntStream.range(START_ENTRY, operationSource.size())
                .filter(this::isOddNumber)
                .forEach(n -> operator.add(operationSource.get(n)));
    }


    public boolean hasNextOperation() {
        return timesOfOperation != 0;
    }

    public int getOperand() {
        return operand.getSource();
    }

    public char getOperator() {
        timesOfOperation--;
        return operator.getSource();
    }

}
