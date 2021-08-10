package model.operation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplicationTest {
    private Operation multiplication = new Multiplication();

    @ParameterizedTest
    @DisplayName("*이외의 Operator 객체를 받아 false를 반환한다.")
    @CsvSource(value = {"+,false", "-,false", "*,true", "/,false"})
    void hasOperation(String symbol, boolean expect) {
        boolean actual = multiplication.hasOperator(symbol);
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("두 수를 받아 곱한 값을 반환한다.")
    void operate() {
        assertThat(multiplication.operate(3.5, 2)).isEqualTo(7);
    }
}