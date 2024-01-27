package com.exlamle;

import com.exlamle.Point;

public class Shape {
    private Point[] points;
// Constructor to initialize
    public Shape(Point[] points) {
        this.points = points;
    }
     // Method to calculate the perimeter
    public double perimeter() {
        double perimeter = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints;
            perimeter += points[i].distanceTo(points[nextIndex]);
        }

        return perimeter;
    }
// Method for determining the length of the longest side
    public double longestSide() {
        double maxLength = 0;

        for (Point point : points) {
            for (Point otherPoint : points) {
                double distance = point.distanceTo(otherPoint);
                if (distance > maxLength) {
                    maxLength = distance;
                }
            }
        }

        return maxLength;
    }
 // Method to calculate the average length
    public double averageSide() {
        double totalLength = 0;
        int numSides = points.length;

        for (int i = 0; i < numSides; i++) {
            int nextIndex = (i + 1) % numSides;
            totalLength += points[i].distanceTo(points[nextIndex]);
        }

        return totalLength / numSides;
    }
}
