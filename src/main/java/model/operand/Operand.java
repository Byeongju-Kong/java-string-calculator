package model.operand;

public class Operand {
    private final int value;
    private static final String OPERAND_REGEX = "^(0|[-]?[1-9]\\d*)$";

    public Operand(String operand) {
        if (!operand.matches(OPERAND_REGEX)) {
            throw new IllegalStateException("정수 자리에 잘못된 입력이 있습니다");
        }
        this.value = Integer.parseInt(operand);
    }

    public int getOperand() {
        return value;
    }
}
