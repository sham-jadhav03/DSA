package Revision.Sheet.Array;

import java.util.Scanner;

public class LeftRotateArray {
    public static void reverse(int[] arr, int a, int b){
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k % n;

        // left
//        reverse(arr, 0, k-1);
//        reverse(arr, k, n-1);
//        reverse(arr, 0, n-1);

        //right
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
