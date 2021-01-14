package com.company;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public double calculatePerimeter(Shape s) {
        double perimeter = 0;
        ArrayList<Point> points = s.getPoints();
        int index = points.size() - 1;
        Point last = points.get(index);
        for (int i = 0; i < points.size() - 1; i++) {
            double distance=last.distance(points.get(i));
            perimeter+=distance;
            last=points.get(i);
        }
        return perimeter;
    }
}
