package controller;

import model.Calculator;
import view.Result;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculation();
        calculator.input();
        calculator.calculate();
        Result.showResult(calculator);
    }

    public static class Input {

        private static final Scanner SCANNER = new Scanner(System.in);

        public static String input() {
            System.out.print("계산하려는 식을 입력하세요 : ");
            String inputString = SCANNER.nextLine().trim();
            SCANNER.close();
            return inputString;
        }
    }
}
