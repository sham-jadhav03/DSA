package com.ArraysQ;

public class LargeArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 89, 90};
        int max= Integer.MIN_VALUE;
        for (int i=0; i< arr.length; i++){
            if (arr[i]>max) max = arr[i];
        }
        System.out.println(max);
    }
}
