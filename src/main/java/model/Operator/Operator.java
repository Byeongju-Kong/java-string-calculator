package model.Operator;

public class Operator {
    private final char operator;

    public Operator(String operator) {
        String OPERATOR = "+-*/";
        if (!OPERATOR.contains(operator)) {
            throw new IllegalStateException("연산기호에 잘못된 입력이 있습니다");
        }
        this.operator = operator.charAt(0);
    }

    public char getOperator() {
        return operator;
    }
}
