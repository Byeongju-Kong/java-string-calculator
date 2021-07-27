package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperandsTest {
    private Operands operands;

    @Test
    @DisplayName("getSource로 값 반환이 잘 되는지 Test")
    public void getSource() {
        operands = new Operands(new String[]{"1", "+", "3", "-", "5"});
        assertThat(operands.getSource()).isEqualTo(1);
        assertThat(operands.getSource()).isEqualTo(3);
        assertThat(operands.getSource()).isEqualTo(5);
    }

}