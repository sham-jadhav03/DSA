package com.Assignment;

import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double h = input.nextDouble();
        double r = input.nextDouble();

        double pi = 3.14;

        double volume = pi*r*r*h/3;
        System.out.println("Volume of cone:" +volume );
    }
}
