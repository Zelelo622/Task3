package ru.vsu.num8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Square(), new Lines(0.6, -2), new Lines(1, -7));

        printColorForPoint(1, 1, picture);
        printColorForPoint(1, 8, picture);
        printColorForPoint(0, -4, picture);
        printColorForPoint(8, -9, picture);

        double x = readPointСoordinate("x --> ");
        double y = readPointСoordinate("y --> ");
        printColorForPoint(x, y, picture);
    }

    static int readPointСoordinate(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter coordinate %s", name);
        return in.nextInt();
    }

    static void printColorForPoint(double x, double y, Picture picture) {
        System.out.println("(" + x + ";" + y + ") ->" + picture.getColor(x, y));
    }
}