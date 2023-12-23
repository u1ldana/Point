package com.exlamle;

import com.Shape;

public class MyApplication {
    public static void main(String[] args) {
        Point[] points = {
                new Point(0, 0),
                new Point(0, 5),
                new Point(3, 5),
                new Point(3, 0)
        };

        Shape myShape = new Shape(points);

        System.out.println("Perimeter: " + myShape.perimeter());
        System.out.println("Longest Side: " + myShape.longestSide());
        System.out.println("Average Side: " + myShape.averageSide());
    }
}
