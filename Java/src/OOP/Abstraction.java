abstract class Shape{
    abstract void draw();
    void message(){
        System.out.println("Shapes have different form");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}
class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Shape shape;
        shape=new Square();
        shape.draw();
        shape.message();

        shape=new Triangle();
        shape.draw();
    }
}
