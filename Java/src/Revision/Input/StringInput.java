package Revision.Input;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Enter a sentence");
        String s = sc.next(); //only print single word
        System.out.println(s);
    }
}
