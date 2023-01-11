package ru.synergy;

import java.util.Scanner;

public class Point {
    double x, y;

    public void move(double dx, double dy){
        x += dx;
        y += dy;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();

        System.out.println("Enter y: ");
        double y = in.nextDouble();
        move(x,y);
    }

    public double getDistance(Point a){
        return  Math.sqrt( Math.pow(x-a.x,2) + Math.pow(y-a.y, 2));
    }
}
