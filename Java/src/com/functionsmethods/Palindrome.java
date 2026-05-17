package com.functionsmethods;

public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int ans = 0;
        while (x>0){
            int rem = x % 10;
            ans = ans * 10 + rem;
            x = x/10;
        }
        return original == ans;
    }
}
