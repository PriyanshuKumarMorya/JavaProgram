package JavaClassProblem;

// Mutilevel heritance

class Grandfather{
    void amount(){
        System.out.println("2 lakhs rupees in amount.");
    }
}
class Father extends Grandfather{
    void property(){
        System.out.println("All property 5 core rupees amount .");
    }
}
class Child extends Father{
    void childrich(){
        System.out.println("Grandfather and father 9 core rupees amount.");
    }
}
public class Priyanshu13 {
    public static void main(String[] args) {
        Grandfather g1= new Grandfather();
        Father f1 = new Father();
        Child c1= new Child();
        g1.amount();
        System.out.println(" ");
        f1.amount();
        f1.property();
        System.out.println(" ");
        c1.amount();
        c1.property();
        c1.childrich();

    }
}
