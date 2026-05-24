package Revision;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(secondSmallestMin(arr));
    }

    static int secondSmallestMin(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE){
            return -1;
        }
        return secondSmallest;
    }
}
