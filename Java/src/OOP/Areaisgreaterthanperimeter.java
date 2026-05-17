import java.util.Scanner;

public class Areaisgreaterthanperimeter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = Sc.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = Sc.nextInt();
        int Area = length * breadth;
        int perimeter = 2 * (length + breadth);
        if (Area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("perimeter is greater than Area");
        }
    }
}
