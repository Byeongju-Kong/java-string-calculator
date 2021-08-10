package model.operation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SubtractionTest {
    private Operation subtraction = new Subtraction();

    @ParameterizedTest
    @DisplayName("-이외의 Operator 객체를 받아 false를 반환한다.")
    @CsvSource(value = {"+,false", "-,true", "*,false", "/,false"})
    void hasOperation(String symbol, boolean expect) {
        boolean actual = subtraction.hasOperator(symbol);
        assertThat(actual).isEqualTo(expect);
    }

    @Test
    @DisplayName("두 수를 받아 더한 값을 반환한다.")
    void operate() {
        assertThat(subtraction.operate(3.5, 2)).isEqualTo(1.5);
    }
}