package com.exlamle;

public class Point {
    private double x;
    private double y;
       // Constructor to initialize x and y coordinates of the point

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
// Method to calculate the distance between two points
    public double distanceTo(Point destination) {
        double deltaX = destination.x - this.x;
        double deltaY = destination.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
 // Override toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
