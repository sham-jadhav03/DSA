package com.Assignment;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        findPrimeFactor(n);

        sc.close();
    }

    static void findPrimeFactor(int n){
        int temp =n;
        for(int i=2; i<=temp; i++){
            if(n%i == 0 && isPrime(i)){
                while(n % i == 0);
                System.out.println(i);
                n /= i;
            }
        }
    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}