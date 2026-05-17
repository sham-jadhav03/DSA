package com.functionsmethods;

import java.util.Scanner;

public class AllSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
//        System.out.println(sum(n));
         int sum =0;
        for (int i =0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

//
//     static int sum ( int n) {
//           if (n<=0){
//               return 0;
//           }
//           else {
//               return n * (n+1)/2;
//           }
//    }
}
