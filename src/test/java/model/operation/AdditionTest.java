package model.operation;

import model.operator.Operator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class AdditionTest {
    private Operation addition = new Addition();

    @Test
    @DisplayName("+를 가지는 Operator 객체를 받아 true를 반환한다.")
    void hasOperation_true() {
        assertThat(addition.hasOperation(Operator.of('+'))).isTrue();
    }

    @ParameterizedTest
    @DisplayName("+이외의 Operator 객체를 받아 false를 반환한다.")
    @ValueSource(chars = {'-', '*', '/'})
    void hasOperation_false(char invalidSource) {
        assertThat(addition.hasOperation(Operator.of(invalidSource))).isFalse();
    }

    @Test
    @DisplayName("두 수를 받아 더한 값을 반환한다.")
    void operate() {
        assertThat(addition.operate(1.5, 2)).isEqualTo(3.5);
    }
}