package controller;

import java.util.Scanner;

public class Input {
    private static final String DELIMITER = " ";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String[] input() {
        String[] inputString = SCANNER.nextLine()
                .trim()
                .replaceAll("\\s+", DELIMITER)
                .split(" ");
        SCANNER.close();
        return inputString;
    }
}
