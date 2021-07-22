package model;

import java.util.List;

public class OperationSource {
    static final int START_ENTRY = 0;
    private static final int MIN_OPERATION_SOURCE_SIZE = 3;
    private final Operands operands;
    private final Operators operators;
    private int timesOfOperation;

    public OperationSource(List<String> operationSource) {
        timesOfOperation = operationSource.size() / 2;
        operands = new Operands(operationSource);
        operators = new Operators(operationSource);
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
