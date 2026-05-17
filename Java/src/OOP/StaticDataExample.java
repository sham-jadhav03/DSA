class Counter {
    static int count = 6; // Static variable

    Counter() {
        count++; // Increment
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDataExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.displayCount();
        c2.displayCount();
        c3.displayCount();
    }
}
