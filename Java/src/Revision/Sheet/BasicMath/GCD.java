package Revision.Sheet.BasicMath;

import java.util.Scanner;

public class GCD {
    public static int findGCD(int a, int b){
        while(b != 0){
            int rem = a%b;
            a=b;
            b = rem;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = findGCD(n1, n2);
        System.out.println(result);
    }
}
