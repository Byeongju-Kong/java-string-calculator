package view;

import model.Calculator;

public class Result {
    public static void showResult(Calculator calculator) {
        System.out.printf("계산결과는 %.1f입니다.", calculator.getResult());
    }
}
