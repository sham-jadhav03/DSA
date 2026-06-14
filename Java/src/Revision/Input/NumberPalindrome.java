package Revision.Input;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));

    }
    static boolean isPalindrome(int x){
        int original = x;
        int ans = 0;
        while(x>0){
            int rem = x % 10;
            ans = ans * rem + 10;
            x = x/10;
        }
        return original == ans;
    }
}
