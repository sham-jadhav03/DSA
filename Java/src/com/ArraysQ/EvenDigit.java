package com.ArraysQ;

public class EvenDigit {
    public static void main(String[] args) {
      int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers (int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
     // function to check whether a number contains even digits or not
     static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
     return false;
    }

    //count number of digits in number
    static int digits (int nums) {
        int count = 0;
        while ( nums > 0){
             count ++;
             nums = nums / 10;
        }
        return count;
    }
}
