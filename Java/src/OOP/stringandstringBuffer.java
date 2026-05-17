public class stringandstringBuffer {
    public static <Sb> void main(String[] args) {
        //using string
        String Str="Sham"; //string created
        Str=Str+" Jadhav"; //new string object is created
        System.out.println("String Result:"+Str);
        //using stringBuffer
        StringBuffer Sb =new StringBuffer("karan");  //StringBuffer is created
        Sb. append(" jadhav");//modifies the existing object
        System.out.println("StringBuffer Result:"+Sb);
    }
}
