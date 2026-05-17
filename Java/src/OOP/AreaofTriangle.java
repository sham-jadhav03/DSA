import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter base:");
        int base=Sc.nextInt();
        System.out.println("Enter height:");
        int height=Sc.nextInt();
        double Area=0.5*( base * height);
        System.out.println("Area of Triangle="+Area);

        Sc.close();
    }
}
