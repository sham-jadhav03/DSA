package Revision.Input;

import java.util.Arrays;
import java.util.Scanner;

public class rePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String s){
        if (s == null || s.length() == 0){
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i <= j){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
