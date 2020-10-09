package ru.vsu.num8;

public class Lines {
    public double k;
    public double b;

    public Lines(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public boolean isPointAboveLine(double x, double y) {
        return y > k * x + b;
    }
}
