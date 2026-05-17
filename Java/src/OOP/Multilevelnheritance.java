class vehicle {  //parent class
    void start() {
        System.out.println("Vehicle  is start");
    }
}
class car extends vehicle{ //Child class
        void drive(){
            System.out.println("Driving a car");
        }
}
class sportcar extends car{  //Grandchild class
    void turboBoost(){
        System.out.println("Sportcar use turboBoost");
    }
}
public class Multilevelnheritance {
    public static void main(String[] args) {
        sportcar sc=new sportcar();
        sc.start();
        sc.drive();
        sc.turboBoost();
    }
}
