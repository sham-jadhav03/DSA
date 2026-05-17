package com.functionsmethods;

public class MethodReverse {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));

    }
    static int reverse(int num) {
        int ans = 0;

        while (num != 0){
            int rem = num % 10;
            num /= 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            ans = ans * 10 + rem;
        }
        return ans;
    }
}
