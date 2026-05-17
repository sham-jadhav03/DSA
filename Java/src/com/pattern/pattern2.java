package com.pattern;

public class pattern2 {
    public static void main(String[] args) {
        star2(4);
    }

    static void star2(int n){
        for(int row=1;row<=n;row++){
            for (int col=1; col<= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
