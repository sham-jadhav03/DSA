package com.functionsmethods;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(Maximum(a , b , c ));
        System.out.println(Minimum(a, b, c ));

    }

    static int Maximum(int a , int b, int c){
        // Approach 1
//        int max = a;
//        if(b > max){
//            max =b;
//        }
//        if (c>max){
//            max=c;
//        }
        // Approach 2
        int max = Math.max(c,Math.max(a,b));
        return max;
    }

    static  int Minimum( int a , int b , int c){
        // Approach 1
//        int min = a;
//        if(b<min){
//            min = b;
//        }
//        if(c<min){
//            min = c;
//        }

        // Approach 2
        int min = Math.min(c,Math.min(a,b));
        return min;
    }
}
