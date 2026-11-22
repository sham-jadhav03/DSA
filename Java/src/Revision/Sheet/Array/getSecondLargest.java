package Revision.Sheet.Array;

public class getSecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(result(arr));
    }
    static int result(int[] arr){
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > f){
                s = f;
                f = arr[i];
            } else if (arr[i] > s && arr[i] != f) {
                s = arr[i];
            }
        }
        return (s == Integer.MIN_VALUE) ? -1: s;
    }
}
