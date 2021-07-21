package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static model.OperationSource.START_ENTRY;

public class Operands {
    private List<Integer> operand;
    private static final String OPERAND_REGEX = "^[0-9]*$";

    public Operands(List<String> operationSource) {
        operand = new ArrayList<>();
        IntStream.range(START_ENTRY, operationSource.size())
                .filter(this::isEvenNumber)
                .forEach(index -> operand.add(Integer.parseInt(operationSource.get(index))));
    }

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private boolean checkSource(String source) {
        if (!source.matches(OPERAND_REGEX)) {
            throw new IllegalStateException("정수의 자리에 잘못된 입력이 있습니다.");
        }
        return true;
    }

    public int getSource() {
        if (operand.size() == 0) {
            throw new NullPointerException("반환할 숫자가 없습니다.");
        }
        return operand.remove(0);
    }


}
