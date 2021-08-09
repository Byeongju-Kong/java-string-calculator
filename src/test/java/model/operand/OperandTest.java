package model.operand;

import model.Operand.Operand;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperandTest {
    private Operand operand;

    @Test
    @DisplayName("Operand 객체가 잘 생성되는지 Test")
    void create() {
        operand = new Operand("1");
        assertThat(operand.getOperand()).isEqualTo(1);
    }

    @Test
    @DisplayName("실-수로 Operand 객체를 생성했을 시에 예외 발생 Test")
    void create_ExceptionByActualNumber() {
        assertThatThrownBy(() -> new Operand("2.5"))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("정수 자리에 잘못된 입력이 있습니다");
    }

    @Test
    @DisplayName("기호로 Operand 객체를 생성했을 시에 예외 발생 Test")
    void create_ExceptionBySymbol() {
        assertThatThrownBy(() -> new Operand("+"))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("정수 자리에 잘못된 입력이 있습니다");
    }
}