import java.lang.Exception;
public class MultipeCatchblock {
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Result: "+c);

        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        try {
            int[] number={2,36,3,5};
            System.out.println("Accessing number: "+number[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error:"+e.getMessage());
        }
        catch (Exception e){
            System.out.println("All exception handle");
        }
    }
}
