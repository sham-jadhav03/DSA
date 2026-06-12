package Revision.Repeats;

public class SumAbsolute {
    public static void main(String[] args) {
     long[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }
    static long sum(long[] arr){
        int n = arr.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sum += Math.abs(arr[i] - arr[j]);
            }
        }

        return sum;
    }
}
