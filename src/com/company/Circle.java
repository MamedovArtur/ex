package com.company;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean containsPoint(Point p){
        return p.distanceTo(center) <= radius;
    }

}
