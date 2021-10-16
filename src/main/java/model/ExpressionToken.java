package model;

public class ExpressionToken {
    private static final String DELIMITER = " ";
    private static final int MIN_SIZE = 3;

    private ExpressionToken() {
    }

    public static String[] getValidExpressionTokens(final String input) {
        String[] expression = input.replaceAll("\\s+", DELIMITER)
                .split(" ");
        if (expression.length < MIN_SIZE || isEven(expression.length)) {
            throw new IllegalArgumentException("계산식을 위한 요소의 개수를 확인하세요");
        }
        return expression;
    }

    private static boolean isEven(final int size) {
        return size % 2 == 0;
    }
}
