package com.Assignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if(n1>n2){
            System.out.println("n1 is  larger number");
        } else if (n2>n1) {
            System.out.println("n2 is larger number");
        }
    }
}
