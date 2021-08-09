package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTest {
    @ParameterizedTest
    @DisplayName("String[]으로 이루어진 계산식을 받아 계산결과를 반환한다")
    @MethodSource("provideValidExpression")
    void getResult(String[] expression, double result) {
        Calculator calculator = new Calculator(expression);
        assertThat(calculator.getResult()).isEqualTo(result);
    }

    static Stream<Arguments> provideValidExpression() {
        return Stream.of(
                arguments(new String[]{"1", "+", "3"}, 4),
                arguments(new String[]{"3", "-", "1", "*", "4"}, 8),
                arguments(new String[]{"2", "/", "1", "+", "2", "*", "4"}, 16)
        );
    }
}