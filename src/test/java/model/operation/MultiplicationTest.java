package model.operation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplicationTest {
    private Operation multiplication = new Multiplication();

    @Test
    @DisplayName("*를 가지는 Operator 객체를 받아 true를 반환한다.")
    void hasOperation_true() {
        assertThat(multiplication.hasOperator("*")).isTrue();
    }

    @ParameterizedTest
    @DisplayName("*이외의 Operator 객체를 받아 false를 반환한다.")
    @ValueSource(strings = {"+", "-", "/"})
    void hasOperation_false(String invalidSource) {
        assertThat(multiplication.hasOperator(invalidSource)).isFalse();
    }

    @Test
    @DisplayName("두 수를 받아 곱한 값을 반환한다.")
    void operate() {
        assertThat(multiplication.operate(3.5, 2)).isEqualTo(7);
    }
}