package Revision.Repeats;

import java.util.Arrays;

public class segregate0and1 {
    public static void main(String[] args) {
        int[] arr= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        result(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  result (int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if(arr[low] == 0){
                low++;
            } else if(arr[high] == 1){
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

    }
}

