package model;

public class OperationTimes {
    private int times;

    public OperationTimes(int operationTimes) {
        times = operationTimes;
    }

    public void decrease() {
        times--;
    }

    public boolean hasLeftTimes() {
        return times != 0;
    }
}
