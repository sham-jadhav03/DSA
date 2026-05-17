//Static method
public class Mathutil {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
class staticmethodexample{
        public static void main(String[] args) {
            int sum=Mathutil.add(5,10); //call static method without creating object
            int product=Mathutil.multiply(3,52);
            System.out.println("sum:"+sum);
            System.out.println("product:"+product);
        }
    }

