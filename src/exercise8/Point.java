package exercise8;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    public Point() {
        double x = 0;
        double y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        x = otherPoint.x;
        y = otherPoint.y;
    }

    public void initialize() {
       x = Utils.INPUT.nextDouble();
       y = Utils.INPUT.nextDouble();
        
    }

    public void translate(double xDelta, double yDelta) {
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
       double newX = x + xDelta;
       double newY = y + yDelta;
       Point p = new Point(newX,newY);
        return p;
    }

    public boolean equals(Point otherPoint) {
        boolean xEquals = Utils.equals(x, otherPoint.x);
        boolean yEquals = Utils.equals(y, otherPoint.y);
        return xEquals && yEquals;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
