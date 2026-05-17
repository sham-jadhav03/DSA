package com.Assignment;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r =input.nextInt();
        float pi = 3.14f;

        float area = 2 * pi * r;
        System.out.println("Perimeter of circle:"+area);
    }
}
