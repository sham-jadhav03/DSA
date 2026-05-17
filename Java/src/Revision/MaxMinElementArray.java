package Revision;

public class MaxMinElementArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 34, 23, 43, 21,2};
        System.out.println("Max: " +maxNum(arr));
        System.out.println("Min: " +minNum(arr));
    }

    static int maxNum(int[] arr){
        int n = arr.length;
        int max=0;
        for(int i=0; i<n; i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }

    static int minNum(int[] arr){
        int n = arr.length;
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
