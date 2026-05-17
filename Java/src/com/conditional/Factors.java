package com.conditional;

import java.util.Scanner;

public  class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        for (int i = 1; /*i<=Math.sqrt(n);*/ i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);  // first factor
//                if (i!=n/i){
//                    System.out.println(n/i);    // avoid the duplicate number if there is a perfect sqr.
//                }
            }
        }
    }
}