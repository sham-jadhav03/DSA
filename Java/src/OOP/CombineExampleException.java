import java.io.*;
public class CombineExampleException {
    public static void CheckAge(int age) throws IllegalArgumentException{
        if(age<18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Eligible for vote");
    }

    public static void main(String[] args) {
        try{
            CheckAge(17);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception handled:"+e.getMessage());
        }
    }
}
