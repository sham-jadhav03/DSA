package leetcode.StringQ;

public class Equivalance {
    public static void main(String[] args) {
       String w1 = "aaaa";
       String w2 =  "bccb";
        System.out.println(isEqualString(w1, w2));
    }
    static boolean isEqualString(String w1, String w2){
        int n = w1.length();
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            count[w1.charAt(i)-'a']++;
            count[w2.charAt(i)-'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if(Math.abs(count[i]) > 3){
                return false;
            }
        }
        return true;
    }
}
