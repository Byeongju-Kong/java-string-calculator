package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expression {
    private static final String DELIMITER = " ";
    private static final int MIN_SIZE = 3;

    public static List<String> getExpression(String input) {
        input = input.replaceAll("\\s+", DELIMITER);
        List<String> expression = new ArrayList<>(Arrays.asList(input.split((DELIMITER))));

        if (isInvalidExpression(expression)) {
            throw new IllegalStateException("계산을 위한 식이 완전하지 않습니다.");
        }
        return expression;
    }

    private static boolean isInvalidExpression(List<String> expression) {
        return expression.size() < MIN_SIZE || isEven(expression.size());
    }

    private static boolean isEven(int size) {
        return size % 2 == 0;
    }

}
