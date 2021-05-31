package com.company;

import java.util.Scanner;

public class FigureReader {
    private Scanner sc;

    public FigureReader(Scanner sc) {
        this.sc = sc;
    }

    public Point readPoint(){
        System.out.println("Enter the x:");
        double x = sc.nextDouble();
        System.out.println("Enter the y:");
        double y = sc.nextDouble();
        return new Point(x,y);
    }

    public Circle readCircle(){
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();
        System.out.println("Enter the center");
        Point center = readPoint();
        return new Circle(center,radius);
    }
}
