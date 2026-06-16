package leetcode.StringQ;

class BuildString {
    public static void main(String[] args) {
        String s = "a#b%*";
        System.out.println(processStr(s));
    }
    public static String processStr(String s) {
        StringBuilder str = new StringBuilder();
        for (char ch: s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                str.append(ch);
            } else if (ch == '*') {
                if (str.length() > 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            } else if (ch == '#') {
                str.append(str.toString());
            } else if (ch == '%'){
                str.reverse();
            }
        }
       return str.toString();
    }
}