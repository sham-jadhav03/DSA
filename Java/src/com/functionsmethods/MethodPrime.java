package com.functionsmethods;

import java.util.Scanner;

public class MethodPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));

//        for (int i=2; i<10; i++){
//            if (isPrime(i)){
//                System.out.print(i + " ");
//            }
//        }

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c =2;
        while (c*c <= n){
           if( n%c ==0){
               return false;
           }
           c++;
        }
        return c*c > n;
    }
}

