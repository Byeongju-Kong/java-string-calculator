package model.operator;

import java.util.Arrays;

public enum Operator {
    PLUS('+'),
    MINUS('-'),
    TIMES('*'),
    DIVIDED_BY('/');

    private final char symbol;

    Operator(final char symbol) {
        this.symbol = symbol;
    }

    public static Operator of(final char symbol) {
        return Arrays.stream(Operator.values())
                .filter(value -> value.getOperator() == symbol)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("연산기호에 잘못된 입력이 있습니다"));
    }

    public char getOperator() {
        return symbol;
    }
}

