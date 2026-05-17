package com.Assignment;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (b>=2*a){
            System.out.println("Invalid triangle:");
        }
        else {
            double area = (b/4) * Math.sqrt(4*a*a -b*b);
            System.out.println("Area of Isosceles Triangle :" + area);
        }
    }
}
