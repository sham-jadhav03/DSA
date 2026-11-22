package Revision.Sheet.Array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println(Arrays.toString(result(arr1, arr2)));
    }
    static int[] result (int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(arr1[i] <= arr2[j]){
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            res[k] = arr1[i];
            i++;
            k++;
        }
        while(j<m){
            res[k] = arr2[i];
            j++;
            k++;
        }
        return res;
    }
}
