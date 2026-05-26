package Revision;

import java.util.Arrays;

public class SortElement {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 1, 9, 8, 5};
        System.out.println(Arrays.toString(sortHalves(arr)));
    }
    public static int[] sortHalves(int[] arr) {
        if(arr == null || arr.length <= 1) return arr;

        int n = arr.length;
        int mid = n/2;

        Arrays.sort(arr,0,mid);
        Arrays.sort(arr,mid, n);

        reverse(arr, mid, n-1);
        return arr;
    }

    static void reverse(int[] arr, int f, int s){
        while (f <s){
            int temp = arr[f];
            arr[f] = arr[s];
            arr[s] = temp;
            f++;
            s--;
        }
    }
}