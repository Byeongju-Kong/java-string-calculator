package model;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Character> operator;
    private static final String OPERATOR_REGEX = "+-*/";

    public Operator() {
        operator = new ArrayList<>();
    }

    private boolean checkSource(String source) {
        if (!OPERATOR_REGEX.contains(source) || source.length() != 1) {
            throw new IllegalStateException("연산 기호의 자리에 잘못된 입력이 있습니다.");
        }
        return true;
    }

    public void add(String source) {
        if (checkSource(source)) {
            operator.add(source.charAt(0));
        }
    }

    public char getSource() {
        if (operator.size() == 0) {
            throw new IndexOutOfBoundsException("반환할 연산기호가 없습니다.");
        }
        return operator.remove(0);
    }
}
