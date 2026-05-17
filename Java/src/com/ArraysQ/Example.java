package com.ArraysQ; //package com.ArraysQ;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int[] arr1 = {12, 2, 4, 5, 6, 7, 1};
        int[] arr2 = {23, 4, 5, 6, 12, 34,0};
        System.out.println(sortArr(arr1));
        System.out.println(sortArr(arr2));
    }

    static int sortArr(int[] arr){
        Arrays.sort(arr); // sort the array in ascending order
        return arr[arr.length-1]; //return the last (largest element) of an array
    }
}

//import java.util.Scanner;
//class Example {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String name;
//        name = scanner.nextLine();
//        System.out.println(name.length());
//        scanner.close();
//    }
//}
//
