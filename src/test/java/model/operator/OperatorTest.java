package model.operator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperatorTest {
    private Operator operator;
    @Test
    @DisplayName("Operator 생성이 잘되는지 Test")
    void create() {
        operator = Operator.of('+');
        assertThat(operator.getOperator()).isEqualTo('+');
    }

    @Test
    @DisplayName("Operator 생성시 숫자가 들어가면 예외 발생 Test")
    void create_ExceptionByNumber() {
        assertThatThrownBy(()-> Operator.of('5'))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산기호에 잘못된 입력이 있습니다");
    }

    @Test
    @DisplayName("Operator 생성시 숫자가 들어가면 예외 발생 Test")
    void create_ExceptionInvalidSymbol() {
        assertThatThrownBy(()-> Operator.of('['))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산기호에 잘못된 입력이 있습니다");
    }
}