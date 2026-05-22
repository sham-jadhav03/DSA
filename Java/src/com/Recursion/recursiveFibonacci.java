package com.Recursion;

public class recursiveFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
    static  int fibonacci(int n) {
        //base condition
        if (n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
