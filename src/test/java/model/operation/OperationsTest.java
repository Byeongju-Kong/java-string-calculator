package model.operation;

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
    void findOperation(String operator, Class<Operation> expect) {
        assertThat(Operations.findOperation(operator).getClass()).isEqualTo(expect);
    }

    static Stream<Arguments> operationProvider() {
        return Stream.of(
                arguments("+", Addition.class),
                arguments("-", Subtraction.class),
                arguments("*", Multiplication.class),
                arguments("/", Division.class)
        );
    }
}