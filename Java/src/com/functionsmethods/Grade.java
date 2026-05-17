package com.functionsmethods;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(marks(n));
    }

    static int marks(int n){
        if (n >= 91 && n <= 100){
            System.out.println("AA");
        }
        if ( n >= 81 && n <= 90){
            System.out.println("AB");
        }
        if (n >= 71 && n <= 80){
            System.out.println("BB");
        }
        if (n >= 61 && n <=70){
            System.out.println("BC");
        }
        if (n >= 51 && n <= 60){
            System.out.println("CD");
        }
        if (n >= 41 && n <= 50){
            System.out.println("DD");
        }
        if ( n <= 40){
            System.out.println("fail");
        }
        return n;
    }
}
