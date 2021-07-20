package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expression {
    private static final String DELIMITER = " ";

    public static List<String> getExpression(String input) {
        input = input.replaceAll("\\s+", DELIMITER);
        return new ArrayList<>(Arrays.asList(input.split(DELIMITER)));
    }
}
