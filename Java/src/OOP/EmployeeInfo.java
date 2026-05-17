public class EmployeeInfo {
    int salary;
    String name;
    //constructor 1:Default constructor
    public EmployeeInfo(){
        salary=1500000 ;
        name="Sham" ;
    }
    public EmployeeInfo(int salary, int name){
        this.salary=salary;
        this.name= "name";
    }
    public void displayInfo(){
        System.out.println("salary:"+salary + "name:"+name);
    }

    public static void main(String[] args) {
        EmployeeInfo E1=new EmployeeInfo();
        EmployeeInfo E2=new EmployeeInfo();
        EmployeeInfo E3=new EmployeeInfo();
        E1.displayInfo();
        E2.displayInfo();
        E3.displayInfo();
    }
}
