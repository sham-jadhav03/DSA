//Inheritance
class Animal{ //parent class
    void eat(){
        System.out.println("ANIMAL eat food");
    }
}
class Dog extends Animal{ //child class
    void bark(){
        System.out.println("Dog is bark");
    }
}
public class Main2 {
    public static void main(String[] args) {
        Dog D1=new Dog();
        D1.eat();
        D1.bark();
    }
}
