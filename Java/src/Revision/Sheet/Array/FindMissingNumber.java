package Revision.Sheet.Array;

import java.util.Scanner;

public class FindMissingNumber {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
         while(i< arr.length){
             int current = arr[i];
             if(i< arr.length && arr[i] != arr[current]){
                 swap(arr,i, current);
             } else {
                 i++;
             }
         }

        for (int j = 0; j < j+1; j++) {
            if(arr[j] != j+1){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(n);
    }
}
