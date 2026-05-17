package com.functionsmethods;

import java.util.Scanner;

public class CircleMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int r = in.nextInt();

        double area =0;
        double circumference =0;
        System.out.println(Area(r, area));
        System.out.println(Circle(r, circumference));
    }

    static double Area(int r , double area){
        double pi = 3.14;
        area = pi * r * r;
        return area ;
    }
    static double Circle(int r , double circumference){
        double pi = 3.14;
        circumference = 2 * pi * r;
        return circumference;
    }
}
