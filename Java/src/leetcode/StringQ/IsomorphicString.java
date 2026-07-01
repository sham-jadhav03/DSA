package leetcode.StringQ;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
       String s = "foo";
       String t = "bar";
        System.out.println(isIsomorphic(s, t));

    }
    static boolean isIsomorphic(String s, String t){
        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)) {
                    return false;
                }
            }
            map.put(c1, c2);
        }
        return true;
    }
}
