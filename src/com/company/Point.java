package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2));
    }
}

