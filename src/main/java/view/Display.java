package view;

import model.Calculator;

public class Display {
    public static void showResult(Calculator calculator) {
        System.out.printf("계산결과는 %.1f입니다.", calculator.getResult());
    }

    public static void alertInput() {
        System.out.print("계산하려는 식을 입력하세요 : ");
    }
}
