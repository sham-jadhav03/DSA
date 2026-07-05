package leetcode.StringQ;

public class Subsequence {
    public static void main(String[] args) {
      String s = "abc";
      String t = "ahbgdc";

        System.out.println(isSubSequence(s, t));
    }
    static boolean isSubSequence(String s, String t){
        if(s.length() == 0) return  true;

        int i = 0;
        int j = 0;

        while(i < s.length() && j< t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == s.length()){
            return true;
        }
        return false;
    }
}
