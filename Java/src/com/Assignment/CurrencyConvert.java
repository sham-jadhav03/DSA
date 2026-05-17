package com.Assignment;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rupees: ");
        float INR= scanner.nextFloat();

        float USD = 87.9f;
        float result = INR/USD;
        System.out.println("Converted currency is: " +result);
    }
}
