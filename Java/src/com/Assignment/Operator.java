package com.Assignment;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = n1+n2;
        int sub = n1-n2;
        int multiply = n1*n2;
        int divide = n1/n2;
        System.out.println("Ans is: " + sum + sub + multiply + divide);
    }
}
