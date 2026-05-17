package com.Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        float C = input.nextFloat();

        float result = (C * 9/5) + 32;
        System.out.println("temperature:"+result);
    }
}
