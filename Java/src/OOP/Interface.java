//Defining an interface
interface King{
    void show(); //abstract method
    void play(); //Abstract method
}
class Soldier implements King { //implementing an interface
    @Override
    public void show() {
        System.out.println("King is showing his class");
    }
    @Override
    public void play() {
        System.out.println("Soldier is playing good");
    }
}
public class Interface {
    public static void main(String[] args) {
        Soldier S1=new Soldier();
        S1.play();
        S1.show();
    }
}
