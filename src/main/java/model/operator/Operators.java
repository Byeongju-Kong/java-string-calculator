package model.operator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;


public class Operators {
    private static final int START_ENTRY = 0;
    private final Queue<String> symbols;

    public Operators(final String[] operationSource) {
        symbols = new LinkedList<>();
        IntStream.range(START_ENTRY, operationSource.length)
                .filter(this::isOddNumber)
                .forEach(index -> symbols.add(operationSource[index]));
    }

    private boolean isOddNumber(final int number) {
        return number % 2 == 1;
    }

    public String getSource() {
        return symbols.remove();
    }
}
