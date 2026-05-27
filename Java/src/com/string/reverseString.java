package com.string;

public class reverseString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }
    static StringBuffer reverse(String str){
        StringBuffer builder = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            builder.append(ch);
        }

        return builder.reverse();
    }
}
