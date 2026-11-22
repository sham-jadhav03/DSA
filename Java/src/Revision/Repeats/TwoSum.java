package Revision.Repeats;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3};
        int target =  6;
        int result = ans(arr, target);
        System.out.println(result);
    }
    static int ans(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;

        while (i<j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return target;
            } else if(sum<target){
                i++;
            } else {
                j--;
            }
        }
        return -1;
    }
}
