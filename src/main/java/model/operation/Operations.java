package model.operation;

import java.util.Arrays;
import java.util.List;

public class Operations {
    private Operations() {
    }

    private static final List<Operation> OPERATION_STRATEGIES
            = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Division());

    public static Operation findOperation(String operator) {
        return OPERATION_STRATEGIES.stream()
                .filter(operation -> operation.hasOperator(operator))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 연산자 입니다"));
    }
}
