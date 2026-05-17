import java.util.Scanner;
//define Algebra method with  add method
class Algebra{
    public int Add(int  a, int b){
       return a+b; //return the sum of a and b
      }
}
public class sumof2number {
    public static void main(String[] args) {
        // create a instance of the Algebra class
       Algebra obj=new Algebra();
       // create a Scanner object for input
        Scanner Sc=new Scanner(System.in);
        // prompt and read two input from user
        System.out.print("Enter first number: ");
        int x=Sc.nextInt();
        System.out.print("Enter second number: ");
        int y=Sc.nextInt();
        //call the add method of the algebra class
        int ans=obj.Add(x,y);
        System.out.println("sum: "+ans);
    }
}
