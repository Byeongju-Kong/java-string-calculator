package model.operation;

import model.operator.Operator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DivisionTest {
    private Operation division = new Division();

    @Test
    @DisplayName("/를 가지는 Operator 객체를 받아 true를 반환한다.")
    void hasOperation_true() {
        assertThat(division.hasOperation(Operator.of('/'))).isTrue();
    }

    @ParameterizedTest
    @DisplayName("/이외의 Operator 객체를 받아 false를 반환한다.")
    @ValueSource(chars = {'+', '*', '-'})
    void hasOperation_false(char invalidSource) {
        assertThat(division.hasOperation(Operator.of(invalidSource))).isFalse();
    }

    @Test
    @DisplayName("0으로 나누려고 하면 예외를 발생시킨다.")
    void operate_ExceptionByDivisionByZero() {
        assertThatThrownBy(() -> division.operate(1.5, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("0으로 나눌 수 없습니다.");
    }

    @Test
    @DisplayName("두 수를 받아 나눈 결과를 반환한다.")
    void operate() {
        assertThat(division.operate(3, 2)).isEqualTo(1.5);
    }
}