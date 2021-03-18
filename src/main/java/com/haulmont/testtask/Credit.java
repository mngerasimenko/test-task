package com.haulmont.testtask;

public class Credit {
    private double limit;
    private double percent;

    public Credit(double limit, double percent) {
        this.limit = limit;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return limit + " - " + percent;
    }
}
