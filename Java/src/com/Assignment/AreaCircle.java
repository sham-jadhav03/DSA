package com.Assignment;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        float pi = 3.14f;

        float area = pi * r * r;

        System.out.println("Area of circle: " +area);
    }
}
