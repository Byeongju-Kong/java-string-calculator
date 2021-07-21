package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static model.OperationSource.START_ENTRY;

public class Operators {
    private List<Character> operator;
    private static final String OPERATOR_REGEX = "+-*/";

    public Operators(List<String> operationSource) {
        operator = new ArrayList<>();
        IntStream.range(START_ENTRY, operationSource.size())
                .filter(this::isOddNumber)
                .forEach(index -> operator.add(operationSource.get(index).charAt(0)));
    }

    private boolean isOddNumber(int number) {
        return number % 2 == 1;
    }

    private boolean checkSource(String source) {
        if (!OPERATOR_REGEX.contains(source) || source.length() != 1) {
            throw new IllegalStateException("연산 기호의 자리에 잘못된 입력이 있습니다.");
        }
        return true;
    }

    public char getSource() {
        if (operator.size() == 0) {
            throw new IndexOutOfBoundsException("반환할 연산기호가 없습니다.");
        }
        return operator.remove(0);
    }
}
