class Captain{   //parent class
    void show(){
        System.out.println("Captain showing his class");
    }
}
class Player extends Captain{
    @Override
    void show(){   //overriding the parent class method
        System.out.println("Player showing his class");
    }
}
public class Methodoverriding {  //  main class
    public static void main(String[] args) {
        Captain obj=new Player();      // parent reference, child object
        obj.show();                   //  calls the overridden method in the child class
    }
}
