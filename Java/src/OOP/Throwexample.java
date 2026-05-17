public class Throwexample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above ");
        }
        System.out.println("Eligible for vote");
    }

    public static void main(String[] args) {
        checkAge(25); //This will throw an exception
    }
}


