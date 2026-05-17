package com.functionsmethods;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Eligible(n));
    }

    static int Eligible(int n){
        if (n >= 18){
            System.out.print("Eligible for vote , he is  ");
        }
        else {
            System.out.print("Not eligible for vote , he is ");
        }
        return n;
    }
}
