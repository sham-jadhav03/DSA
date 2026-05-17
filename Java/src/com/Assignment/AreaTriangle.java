package com.Assignment;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int b =input.nextInt();

        float area = (float) (0.5 * h * b);
        System.out.println("Area of Triangle");
    }
}
