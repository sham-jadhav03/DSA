package com.Assignment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number in series:");
        int n = input.nextInt();

//        int n1 = 0, n2 = 1;
//
//        System.out.println("Fibonacci series up to" + n + "terms:");
//
//        for (int i=1; i<=n ; i++ ){
//            System.out.println(n1+ "  ");
//            int temp =n1+n2;
//            n1 = n2;
//            n2 = temp;
//        }

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
