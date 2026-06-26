package com.Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
      int ans = sumOfDigits(421);

        System.out.println(ans);
    }
    static int sumOfDigits(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
