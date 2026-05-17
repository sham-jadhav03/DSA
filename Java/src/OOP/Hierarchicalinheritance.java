class Sun{ //parent class
    void rise() {
        System.out.println("Sun is always rise");
    }
}
class Moon extends Sun{ //child class 1
    void shine() {
        System.out.println("moon is shining");
    }
}
class Earth extends Sun { //child class 2
    void great(){
        System.out.println("Earth is always great");
    }
}
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        Moon M1 = new Moon();
        M1.shine();  // Moon-specific method
        M1.rise();  //Inherited from sun
        Earth E1 = new Earth();
        E1.great(); // Earth-specific method

    }
}