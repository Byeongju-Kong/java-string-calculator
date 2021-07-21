package model;

import java.util.List;

public class OperationSource {
    static final int START_ENTRY = 0;
    private static final int MIN_OPERATION_SOURCE_SIZE = 3;
    private final Operand operand;
    private final Operator operator;
    private int timesOfOperation;

    public OperationSource(List<String> operationSource) {
        timesOfOperation = operationSource.size() / 2;

        if (isInvalidSize(operationSource.size())) {
            throw new IllegalStateException("연산식이 완벽하지 않습니다.");
        }
        operand = new Operand(operationSource);
        operator = new Operator(operationSource);
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private boolean isInvalidSize(int size) {
        return isEvenNumber(size) || size < MIN_OPERATION_SOURCE_SIZE;
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
