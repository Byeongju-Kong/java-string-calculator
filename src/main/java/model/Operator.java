package model;

public class Operator {
    private final char operator;

    public Operator(String operator) {
        String OPERATOR_REGEX = "+-*/";
        if (!OPERATOR_REGEX.contains(operator)) {
            throw new IllegalStateException("연산기호에 잘못된 입력이 있습니다");
        }
        this.operator = operator.charAt(0);
    }

    public char getOperator() {
        return operator;
    }
}
