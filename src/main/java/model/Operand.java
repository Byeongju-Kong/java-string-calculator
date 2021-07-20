package model;

import java.util.ArrayList;
import java.util.List;

public class Operand {
    private List<Integer> operand;
    private static final String OPERAND_REGEX = "^[0-9]*$";

    public Operand() {
        operand = new ArrayList<>();
    }

    private boolean checkSource(String source) {
        if (!source.matches(OPERAND_REGEX)) {
            throw new IllegalStateException("정수의 자리에 잘못된 입력이 있습니다.");
        }
        return true;
    }

    public void add(String source) {
        if (checkSource(source)) {
            operand.add(Integer.parseInt(source));
        }
    }

    public int getSource() {
        if (operand.size() == 0) {
            throw new NullPointerException("반환할 숫자가 없습니다.");
        }
        return operand.remove(0);
    }


}
