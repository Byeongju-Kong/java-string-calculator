package model.operand;

public class Operand {
    private final int operand;

    public Operand(String operand) {
        String OPERAND_REGEX = "^[0-9]*$";
        if (!operand.matches(OPERAND_REGEX)) {
            throw new IllegalStateException("정수 자리에 잘못된 입력이 있습니다");
        }
        this.operand = Integer.parseInt(operand);
    }

    public int getOperand() {
        return operand;
    }
}
