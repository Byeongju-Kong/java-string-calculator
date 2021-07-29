package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperationTest {
    private Operation operation;

    @Test
    @DisplayName("더하기 Test")
    public void add() {
        operation = Operation.PLUS;
        assertThat(operation.operate(1.0, 2)).isEqualTo(3.0);
    }

    @Test
    @DisplayName("빼기 Test")
    public void subtract() {
        operation = Operation.MINUS;
        assertThat(operation.operate(3.0, 2)).isEqualTo(1.0);
    }

    @Test
    @DisplayName("곱하기 Test")
    public void multiply() {
        operation = Operation.TIMES;
        assertThat(operation.operate(3.0, 2)).isEqualTo(6.0);
    }

    @Test
    @DisplayName("나누기 Test")
    public void divide() {
        operation = Operation.DIVIDE;
        assertThat(operation.operate(3.0, 2)).isEqualTo(1.5);
    }

    @Test
    @DisplayName("0으로 나누기 예외 발생 Test")
    public void create() {
        operation = Operation.DIVIDE;
        assertThatThrownBy(() -> operation.operate(3.0, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("0으로 나눌 수 없습니다");
    }
}