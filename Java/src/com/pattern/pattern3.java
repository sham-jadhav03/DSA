package com.pattern;

public class pattern3 {
    public static void main(String[] args) {
    star3(5);
    }

    static void star3(int n){
        for (int row=1; row<=n; row++){
            for (int col=row; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
