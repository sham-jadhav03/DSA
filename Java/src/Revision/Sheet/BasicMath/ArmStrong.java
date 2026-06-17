package Revision.Sheet.BasicMath;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmStrong {
    public static boolean isArmStrong(int x){
        int original = x;
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        while(original != 0){
            int rem = original % 10;
            arr.add(rem);

            original /= 10;
        }

        for (int i = 0; i < arr.toArray().length; i++) {
            sum += (int) Math.pow(arr.get(i), arr.toArray().length);
        }
        return sum == x;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmStrong(n));

    }
}
