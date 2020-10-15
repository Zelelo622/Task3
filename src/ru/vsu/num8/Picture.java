package ru.vsu.num8;

public class Picture {
    private Square square;
    private Lines line1;
    private Lines line2;

    public Picture(Square square, Lines line1, Lines line2) {
        this.square = square;
        this.line1 = line1;
        this.line2 = line2;
    }

    public SimpleColor getColor(double x, double y) {
        if (isColorOrange(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (isColorWhite(x, y)) {
            return SimpleColor.WHITE;
        }
        if (isColorYellow(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.GREEN;
    }

    boolean isColorOrange(double x, double y) {
        return (square.isPointInsideSquare(x, y));
    }

    boolean isColorWhite(double x, double y) {
        return (line2.isPointInsideArea(x, y) && !line1.isPointInsideArea(x, y));
    }

    boolean isColorYellow(double x, double y) {
        return (line1.isPointInsideArea(x, y));
    }
}
