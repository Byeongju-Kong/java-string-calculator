package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static model.ExpressionToken.getValidExpressionTokens;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ExpressionTest {
    @ParameterizedTest
    @DisplayName("짝수개 혹은 1개의 요소를 가지는 문자열 식을 받으면 예외를 발생시킨다.")
    @ValueSource(strings = {"1", "1 + 2 -"})
    void getValidExpression_ExceptionByWrongNumberOfElement(String wrongInputString) {
        assertThatThrownBy(() -> getValidExpressionTokens(wrongInputString))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("계산식을 위한 요소의 개수를 확인하세요");
    }

    @ParameterizedTest
    @DisplayName("3이상의 홀수개의 요소로 이루어진 문자열 식을 받아 String[]로 반환한다")
    @MethodSource("validParameterProvider")
    void getValidException_Success(String inputString, String[] expectedResult) {
        assertThat(getValidExpressionTokens(inputString)).isEqualTo(expectedResult);
    }

    static Stream<Arguments> validParameterProvider() {
        return Stream.of(
                arguments("1 + 2 * 3", new String[]{"1", "+", "2", "*", "3"}),
                arguments("2 * 3 / 4 - 7", new String[]{"2", "*", "3", "/", "4", "-", "7"}));
    }
}