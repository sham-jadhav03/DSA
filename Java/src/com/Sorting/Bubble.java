package com.Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static  void bubble(int[] arr){
        int n = arr.length;
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < n; i++) {
            swapped  = false;

            for (int j = 1; j < n-i; j++) {  //for each step, max item will come at the last respective index
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }

        }
    }
}
