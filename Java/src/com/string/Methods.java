package com.string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name  = "Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf("e"));
        System.out.println("   Sham   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
