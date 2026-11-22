package Revision.Repeats;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 5, 5};
        System.out.println(result(arr));
    }
    static int result(int[] arr){
        int high = 0;
        int res = 1;
        int low = 1;

        while (low < arr.length) {
            if (arr[low] == arr[low - 1]) {
                low++;
                continue;
            }
            arr[high + 1] = arr[low];
            high++;
            res++;
            low++;
        }
        return res;
    }
}
