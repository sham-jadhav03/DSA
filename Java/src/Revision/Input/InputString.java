package Revision.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();

        for (Integer token : arr){
            int num = Integer.parseInt(String.valueOf(token));
            arr.add(num);
        }
        for (int a: arr){
            System.out.println(a + " ");
        }

    }
}
