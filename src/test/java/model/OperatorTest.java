package model;

import model.Operator.Operator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperatorTest {
    private Operator operator;
    @Test
    @DisplayName("Operator 생성이 잘되는지 Test")
    public void create() {
        operator = new Operator("+");
        assertThat(operator.getOperator()).isEqualTo('+');
    }

    @Test
    @DisplayName("Operator 생성시 숫자가 들어가면 예외 발생 Test")
    public void create_ExceptionByNumber() {
        assertThatThrownBy(()-> new Operator("5"))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("연산기호에 잘못된 입력이 있습니다");
    }

    @Test
    @DisplayName("Operator 생성시 숫자가 들어가면 예외 발생 Test")
    public void create_ExceptionInvalidSymbol() {
        assertThatThrownBy(()-> new Operator("["))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("연산기호에 잘못된 입력이 있습니다");
    }
}