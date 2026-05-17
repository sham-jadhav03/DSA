//Method overloading   Polymorphism
 public class calculator {
    //method 1
    public int add(int a,int b){
        return a+b;
    }
    //method 2
    public int add(int a,int b,int c) {
        return a+b+c;
    }                
    // method 3
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args){
        calculator calc=new calculator();
        System.out.println("sum of two integer:"+calc.add(12,90));
        System.out.println("sum three integer:"+calc.add(12,90,78));
        System.out.println("sum of two integer:"+calc.add(23.4,6.6));
    }

}
