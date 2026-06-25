package com.BitWise;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // m1
//        if(n % 2 == 0){
//            System.out.println("Even no");
//        } else {
//            System.out.println("Odd no");
//        }
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
