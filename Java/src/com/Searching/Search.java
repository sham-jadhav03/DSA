package com.Searching;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 23, 43, 56, 34, 21, 10, 4};
        int target = 34;
        System.out.println(LinearSearch(arr, target));
    }
    static int LinearSearch (int[] arr , int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }

}
