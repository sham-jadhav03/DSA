package com.functionsmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isArmstrong(n));

    }

        static boolean isArmstrong(int n){
        int original = n;
        int sum=0;

        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}

//    static boolean isArmstrong(int n) {
//        int  k = n, sum = 0;
//        ArrayList<Integer> arr = new ArrayList<>();
//        while (k != 0) {
//            int x = k % 10;
//            arr.add(x);
//
//            k = k / 10;
////
//
//        }
//        for (int i = 0; i < arr.toArray().length; i++) {
//            sum = sum + (int) Math.pow(arr.get(i), arr.toArray().length);
//        }
//        return sum == n;
//    }
//}