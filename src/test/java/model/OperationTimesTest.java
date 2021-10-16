package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperationTimesTest {
    @Test
    @DisplayName("decrease 메소드로 남은 연산횟수를 줄이고 isOver함수로 남은 연산횟수가 0인지 반환한다.")
    void hasLeftOperationTimes() {
        OperationTimes operationTimes = new OperationTimes(1);
        operationTimes.decrease();
        boolean actual = operationTimes.hasLeftTimes();
        assertThat(actual).isFalse();
    }
}