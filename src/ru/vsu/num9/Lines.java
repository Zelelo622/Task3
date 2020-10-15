package ru.vsu.num9;

public class Lines {
    public double k;
    public double b;

    public Lines(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public boolean isPointInsideArea(double x, double y) {
        return y > k * x + b;
    }
}
