package com.Assignment;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          int u = in.nextInt();
          int bill = 0;

          if (u<=100){
              double rate = 1.50;
              bill = (int) (rate * u);
          }
        if (u<=200){
            double rate = 2.50;
            bill = (int) (rate * u);
        }
        if (u<=300){
            double rate = 3.50;
            bill = (int) (rate * u);
        }
        if (u<=400){
            double rate = 6;
            bill = (int) (rate * u);
        }
        System.out.println(bill);
    }
}
