
public class Exception {
    public static void main (String [] args)
    {
        int a = 12 ;
        int b = 0 ;
        try{
            int c = a / b ;
            System.out.println("result : " +c);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        finally
        {
            System.out.println(" Always execute");
        }
    }
}

