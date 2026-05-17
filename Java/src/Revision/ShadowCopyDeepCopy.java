package Revision;

import java.util.Arrays;

public class ShadowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {12,23,54,3,5,7,45};
//        ShadowCopy
//        int[] x = arr;
//        x[0] = 100;
        // DeepCopy
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(y[0]);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
