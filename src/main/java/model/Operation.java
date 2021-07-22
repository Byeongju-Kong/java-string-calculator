package model;

import java.util.List;

public class Operation {
    static final int START_ENTRY = 0;
    private static final int MIN_OPERATION_SOURCE_SIZE = 3;
    private final Operands operands;
    private final Operators operators;
    private int timesOfOperation;

    public Operation(List<String> operationSource) {
        timesOfOperation = operationSource.size() / 2;

        if (isInvalidSize(operationSource.size())) {
            throw new IllegalStateException("연산식이 완벽하지 않습니다.");
        }
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
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
        return operands.getSource();
    }

    public char getOperator() {
        timesOfOperation--;
        return operators.getSource();
    }

}
