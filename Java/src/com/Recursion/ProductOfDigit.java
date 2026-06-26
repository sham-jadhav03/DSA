package com.Recursion;

public class ProductOfDigit {
    public static void main(String[] args) {
        int ans = product(421);
        System.out.println(ans);
    }
    static int product (int n){
        if( n % 10 == n){
            return n;
        }

        return (n%10) * (n/10);
    }
}
