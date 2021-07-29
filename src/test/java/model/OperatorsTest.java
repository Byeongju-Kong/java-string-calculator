package model;

import model.Operator.Operators;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorsTest {
    private Operators operators;

    @Test
    @DisplayName("Operators의 객체가 잘 생성되고 getSource로 값이 잘 반환되는지 Test")
    public void create() {
        operators = new Operators(new String[]{"1", "+", "3", "-", "5"});
        assertThat(operators.getSource()).isEqualTo('+');
        assertThat(operators.getSource()).isEqualTo('-');
    }

}