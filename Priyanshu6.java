package JavaClassProblem;

class Country{
    public final void display(){
        System.out.println("India is a powerful country");
    }
}
class Up extends Country{
     void display2(){
        System.out.println("Up is powerful state ");
    }
}
public class Priyanshu6 {
    public static void main(String[] args) {
        Up c2= new Up();
        c2.display();
        c2.display2();

    }
}
