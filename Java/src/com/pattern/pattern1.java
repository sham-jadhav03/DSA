package com.pattern;

public class pattern1 {
    public static void main(String[] args) {
        star(4);
    }

//    static void start1(int n){
//        // for every row, run the col
//        for (int row = 1; row <= n; row++){
//            for(int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            //when one row is printed, we need to add a newline
//            System.out.println();
//        }
//    }

    static void star(int n) {
        if (n == 0) return;
        star(n - 1);
        System.out.println("* ".repeat(n));
    }

}
