package com.Assignment;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side of triangle: ");
        int a = input.nextInt();
        float area = (float) ((1.73/4) * (a * a));
        System.out.println("Area of equilateral triangle is: " + area);
    }
}
