package leetcode.StringQ;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(word(pattern, s));
    }
    static boolean word(String pattern, String s){
        String[] str = s.split("");
        if(pattern.length() != str.length){
            return false;
        }

        HashMap<Character, String> hm = new HashMap<Character, String>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containKey = hm.containsKey(ch);
            if (hm.containsKey(str[i]) && !containKey){
                return false;
            }
            if(containKey && !hm.get(ch).equals(str[i])){
                return false;
            }
            else {
                hm.put(ch, str[i]);
            }
        }
        return true;
    }
}
