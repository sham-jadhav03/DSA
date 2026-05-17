package com.ArraysQ;

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[] accounts){
        //person = rol
        //account = col
        int ans = Integer.MIN_VALUE;
//        for (int person = 0; person < accounts.length; person++)
         for(int[] ints : new int[][]{accounts}) {
            int sum = 0;
//            for (int account = 0; account < accounts[person].length; account++)
               for (int anInt : ints){
//                sum += accounts[person][account];
                   sum += anInt;
            }
               if (sum > ans){
                   ans = sum ;
               }
        }
         return ans;
    }
}
