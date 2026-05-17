//Dynamic method dispatch
class Car{
    void start(){
        System.out.println("Car is just start");
    }
}
class Mercedes extends Car{
    @Override
    void start(){
        System.out.println("Mercedes is good car");
    }
}
class Mahindra extends Car {
    @Override
    void start(){
        System.out.println("Mahindra is excellent car");
    }
}
public class Dynamicmethod {
    public static void main(String[] args) {
        Car car;
        car=new Mercedes();
        car.start();

        car=new Mahindra();
        car.start();
    }
}
