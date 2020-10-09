package ru.vsu.num8;

public class Picture {
    private static Square square;
    private static Lines line1;
    private static Lines line2;

    public Picture(Square square, Lines line1, Lines line2) {
        Picture.square = square;
        Picture.line1 = line1;
        Picture.line2 = line2;
    }

    public static SimpleColor getColor(double x, double y) {
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

    static boolean isColorOrange(double x, double y) {
        return (line1.isPointAboveLine(x, y) && square.isPointInSquare(x, y) || !line1.isPointAboveLine(x, y) && square.isPointInSquare(x, y));
    }

    static boolean isColorWhite(double x, double y) {
        return (line2.isPointAboveLine(x, y) && !line1.isPointAboveLine(x, y) && !square.isPointInSquare(x, y));
    }

    static boolean isColorYellow(double x, double y) {
        return (line1.isPointAboveLine(x, y) && !square.isPointInSquare(x, y));
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + ";" + y + ") ->" + getColor(x,y));
    }
}
