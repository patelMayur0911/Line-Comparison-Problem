package com.lineComparison;

import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 2);
        Point p4 = new Point(3, 4);

        Line L1 = new Line(p1, p2);
        Line L2 = new Line(p3, p4);

        System.out.println("Length of Line 1: " + L1.length());
        System.out.println("Length of Line 2: " + L2.length());

        // UC1 Equality Check
        System.out.println("Equality Check : "+ L1.equals(L2));

        // UC2 Comparison Check
        int comparisonResult = Double.compare(L1.length(), L2.length());

        if (comparisonResult == 0) {
            System.out.println("both lines are equal.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter.");
        } else {
            System.out.println("Line 1 is longer.");
        }
    }
}
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    private Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    public boolean equals(Line otherLine) {
        return this.length() == otherLine.length();
    }
}


