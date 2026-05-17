interface Multiplication {
    void multiply(int a, int b);
}
class MultiplicationImpl implements Multiplication {
    @Override
    public void multiply(int a, int b){
        System.out.println("The result of multiplication is: "+(a*b));
    }
}
public class InterfaceMultiplication {
    public static void main(String[] args) {
        Multiplication multiplication=new MultiplicationImpl();
        multiplication.multiply(5,3);
    }
}
