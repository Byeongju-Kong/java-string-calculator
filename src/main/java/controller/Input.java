package controller;

import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Input() {
    }

    public static String input() {
        String inputString = SCANNER.nextLine().trim();
        SCANNER.close();
        return inputString;
    }
}
