package Revision.Sheet.BasicMath;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n){
        if (n < 0) {
            return false;
        }
        int original = n;
        int ans = 0;
        while (n>0){
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        return original == ans;
    }

}
