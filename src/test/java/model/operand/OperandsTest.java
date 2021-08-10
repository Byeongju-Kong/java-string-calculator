package model.operand;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OperandsTest {
    private Operands operands;

    @Test
    @DisplayName("getSource로 값 반환이 잘 되는지 Test")
    void getSource() {
        operands = new Operands(new String[]{"1", "+", "3", "-", "-5"});
        assertAll(
                () -> assertEquals(operands.getSource(), 1),
                () -> assertEquals(operands.getSource(), 3),
                () -> assertEquals(operands.getSource(), -5)
        );
    }

    @Test
    @DisplayName("Queue의 size가 0인데, getSource를 호출하면 예외를 발생시킨다.")
    void getSource_ExceptionByIndexOutOfBounds() {
        operands = new Operands(new String[]{"1", "+", "3"});
        operands.getSource();
        operands.getSource();
        assertThatThrownBy(() -> operands.getSource())
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessage("반환할 숫자가 없습니다.");
    }
}