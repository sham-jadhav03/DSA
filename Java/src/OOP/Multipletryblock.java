public class Multipletryblock {
    public static void main(String[] args) {
        try {
            int a=12;
            int b=0;
            int c=a/b;
            System.out.println("Result:"+c);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        try {
            int[] numbers={3,5,9};
            System.out.println("Accessing a number:"+numbers[4]);
            }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception handle:"+e.getMessage());
        }
        try {
            String str=null;
            System.out.println("String length:"+str.length());
        }catch (NullPointerException e){
            System.out.println("Exception checked: cannot access a string length ");
        }
        System.out.println("I am able to  solve exception problem");
    }
}
