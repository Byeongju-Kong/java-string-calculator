package controller;

public class Expression {
    private static final int MIN_SIZE = 3;

    public static boolean isValidExpression(String[] expression) {
        return expression.length > MIN_SIZE || isOdd(expression.length);
    }

    private static boolean isOdd(int size) {
        return size % 2 == 1;
    }

}
