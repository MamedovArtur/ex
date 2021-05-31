package com.company;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx*dx+dy*dy);
    }

    @Override
    public String toString() {
        return "Point[ "+x+", "+y+" ]";
    }
}
