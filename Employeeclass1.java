package Lecture;

//class Employee{
//     String name;
//     int Employeeid;
//      int salary;
//    Employee(String name,int Employeeid,int salary){
//        this.name=name;
//        this.Employeeid=Employeeid;
//        this.salary=salary;
//    }
//    void display(){
//        System.out.println("Name :"+name);
//        System.out.println("Empolyee id : "+Employeeid);
//        System.out.println("Salary: "+salary);
//    }
//}
//class Manager extends Employee{
//     String department;
//     Manager(String name,int Employeeid,int salary,String department){
////        this.name=name;
////        this.Employeeid=Employeeid;
////        this.salary=salary;
//        super(name,Employeeid,salary);
//        this.department= department;
//    }
//    void displays(){
//        super.display();
//        System.out.println("Department is : "+department);
//
//    }
//}
//
//public class Employeeclass1 {
//    public static void main(String[] args) {
//        Manager m = new Manager("Priyanshu kumar",24220027,4356788,"Smart Computing");
//        m.displays();
//
//
//    }
//
//}
import java.util.Scanner;

class NotEqualException extends Exception {
    public NotEqualException(String msg) { super(msg); }
}

public class Employeeclass1 {
    public static void checkValue(float value) throws NotEqualException {
        if (value != 3.14f) throw new NotEqualException("Value is not equal to 3.14");
        else System.out.println("Value is equal to 3.14");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a float value: ");
        float input = scanner.nextFloat();
        try { checkValue(input); }
        catch (NotEqualException e) { System.out.println("Exception caught: " + e.getMessage()); }
    }
}
