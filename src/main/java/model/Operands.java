package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static model.OperationSource.START_ENTRY;

public class Operands {
    private List<Operand> operands;
    private static final String OPERAND_REGEX = "^[0-9]*$";

    public Operands(List<String> operationSource) {
        operands = new ArrayList<>();
        IntStream.range(START_ENTRY, operationSource.size())
                .filter(this::isEvenNumber)
                .forEach(index -> operands.add(new Operand(operationSource.get(index))));
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }


    public int getSource() {
        if (operands.size() == 0) {
            throw new IndexOutOfBoundsException("반환할 숫자가 없습니다.");
        }
        return operands.remove(0).getOperand();
    }


}
