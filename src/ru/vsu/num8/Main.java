package ru.vsu.num8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Square(), new Lines(0.6, -2), new Lines(1, -7));

        Picture.printColorForPoint(1, 1);
        Picture.printColorForPoint(1, 8);
        Picture.printColorForPoint(0, -4);
        Picture.printColorForPoint(8, -9);

        double x = readСoordinate("x --> ");
        double y = readСoordinate("y --> ");
        Picture.printColorForPoint(x, y);
    }

    static int readСoordinate(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter coordinate %s", name);
        return in.nextInt();
    }
}