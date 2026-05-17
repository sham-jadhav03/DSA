package com.Assignment;

import java.util.Scanner;

public class SimpleInterest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your principle amount: ");
            int p = input.nextInt();
            System.out.println("Enter the rate of interest: ");
            float r = input.nextFloat();
            System.out.println("Enter time in year: ");
            int t = input.nextInt();

            float SI = (p*r*t)/100;

            System.out.println("Simple interest is:" +SI);
        }
    }
