package com.exlamle;

public class MyApplication {
    public static void main(String[] args) {
         // Creating an array of points to form a shape
        Point[] points = {
                new Point(0, 0),
                new Point(0, 5),
                new Point(3, 5),
                new Point(3, 0)
        };
  // Creating a shape object using the array of points
        Shape myShape = new Shape(points);
// printing the perimeter
        System.out.println("Perimeter: " + myShape.perimeter());
    // printing the length of the longest string
        System.out.println("Longest Side: " + myShape.longestSide());
        // printing the average length
        System.out.println("Average Side: " + myShape.averageSide());
    }
}
