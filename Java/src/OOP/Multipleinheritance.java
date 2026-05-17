//multiple Inheritance
interface Printable{ //patent class
    void print();
}
interface Scannable{
    void scan();
}
class PrinterScanner implements Printable,Scannable{
    @Override
    public void print() {
        System.out.println("Printing a document");
    }
    @Override
    public void scan() {
        System.out.println("Scanning a document");
    }
}
public class Multipleinheritance {
    public static void main(String[] args) {
        PrinterScanner P1 = new PrinterScanner();
        P1.print();
        P1.scan();
    }
}
