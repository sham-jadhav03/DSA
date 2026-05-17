package com.conditional;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

       //Approach 1
//        int max =a;
//        if(b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
        //Approach 2
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
