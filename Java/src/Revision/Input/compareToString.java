package Revision.Input;

import java.util.Scanner;

public class compareToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

//        str1 = str1 + str2;
           str1 = str1.concat(str2);
        System.out.println(str1);
//        System.out.println(str2.compareTo(str1));
    }
}
