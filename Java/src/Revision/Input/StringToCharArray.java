package Revision.Input;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (char ch: arr){
            System.out.println(ch);
        }
    }
}
