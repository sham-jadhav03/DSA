package com.pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);
    }

    static void star(int n) {
        for (int row=1; row<=n; row++){
            char ch = 'A';
            for (int col=1; col<=row; col++){
                System.out.print(ch);
                if(col<row){
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
        }
    }


}

