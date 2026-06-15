package Revision.Input;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello Shyam the developer";
        System.out.println(reverse(str));
    }
    static String reverse(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
