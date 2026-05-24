package Revision;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("max no. is:" +max1(arr));
    }

    static int max1 (int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]> max) {
//                max = arr[i];
//            }
            max = Math.max(max, arr[i]);
        }
        return  max;
    }
}
