package model;

public enum Operation {
    PLUS("+") {
        @Override
        public double operate(double x, int y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double operate(double x, int y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double operate(double x, int y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double operate(double x, int y) {
            return divide(x, y);
        }
    };

    private final String symbol;

    public abstract double operate(double x, int y);

    Operation(String symbol) {
        this.symbol = symbol;
    }

    double divide(double x, int y) {
        if(y == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return x / y;
    }

}
