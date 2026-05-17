package com.functionsmethods;

import java.util.Scanner;

public class AddMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(add(n1,n2));
    }

    static int add(int n1 ,int n2){
        return n1 +n2;
    }
}
