package com.string;

class Solution {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(print(str));
    }
    static boolean print(String s){
        if(s == null ) return false;
      for(int i=0; i<s.length(); i++){
         System.out.println(s.charAt(i));
      }
        return true;
    }
}