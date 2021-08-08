package model.operation;

import model.operator.Operator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class OperationsTest {
    @ParameterizedTest
    @MethodSource("operationProvider")
    @DisplayName("연산자를 받아 실제 구현 객체를 반환한다")
    void findOperation(Operator operator, Class<Operation> expect) {
        assertThat(Operations.findOperation(operator).getClass()).isEqualTo(expect);
    }

    static Stream<Arguments> operationProvider() {
        return Stream.of(
                arguments(Operator.PLUS, Addition.class),
                arguments(Operator.MINUS, Subtraction.class),
                arguments(Operator.TIMES, Multiplication.class),
                arguments(Operator.DIVIDED_BY, Division.class)
        );
    }
}