package com.company;


import java.util.Scanner;

public class Main {
    private final static int POINT_COUNT = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FigureReader reader = new FigureReader(sc);
        Circle circle = reader.readCircle();
        int counter = 0;
        for (int i = 0; i < POINT_COUNT; i++) {
            System.out.printf("Enter the %d point\n",i+1);
            Point p = reader.readPoint();
            if(circle.containsPoint(p)){
                counter++;
            }
        }

        System.out.printf("Count of points in circle %d\n",counter);

    }


}
