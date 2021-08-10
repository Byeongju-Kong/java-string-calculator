package model.operand;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class OperandTest {
    @ParameterizedTest
    @DisplayName("Operand 객체가 잘 생성되는지 Test")
    @MethodSource("provideOperand")
    void create(String givenOperand, int returnedOperand) {
        Operand operand = new Operand(givenOperand);
        assertThat(operand.getOperand()).isEqualTo(returnedOperand);
    }

    @ParameterizedTest
    @DisplayName("실-수로 Operand 객체를 생성했을 시에 예외 발생 Test") //TODO : 실수 -> 정수가 아닌 실수
    @ValueSource(strings = {"2.5", "+"})
    void create_ExceptionByActualNumber(String wrongOperand) {
        assertThatThrownBy(() -> new Operand(wrongOperand))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("정수 자리에 잘못된 입력이 있습니다");
    }
}