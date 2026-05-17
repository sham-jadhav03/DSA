package leetcode;

import java.util.Arrays;

class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4,0,1,2};
        MissingNumber ms = new MissingNumber();
        int ans = ms.missingNumber(arr);
        System.out.println(ans);

        System.out.println(Arrays.toString(arr));
    }

    public int missingNumber (int[] arr){
        int i=0;
        while(i< arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        //case 2: if all index is correct
        return arr.length;
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
