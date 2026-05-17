package com.conditional;

import java.util.Scanner;

public class InputLarge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;

        while (n!=0){
            n = in.nextInt();
            if (n==0){
               break;   // break
            } else if (n>max) {
                max = n; //update
            }
        }
        System.out.println(max);
    }
}

// do{
      //code
// } while(condition);