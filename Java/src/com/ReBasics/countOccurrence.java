package com.ReBasics;

import java.util.Scanner;

public class countOccurrence {
    public static void main(String[] args) {
        int[] arr = {12, 2, 3,4, 2, 4, 2, 1};
        int x = 2;
//        System.out.println(occurrence(arr, x));
        System.out.println(lastOccurrence(arr, x));
    }
    static int occurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) lastIndex = i;
        }
        return lastIndex;
    }
}
