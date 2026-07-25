package JavaClassProblem;

class Tanu1{
    public final void display(){
        System.out.println("I love you Priyanshu.");
    }
}
class Tanu2 extends Tanu1{
    void jaan(){
        System.out.println("Very very love so much Tanu.");
    }
}

public class Priyanshu15 {
    public static void main(String[] args) {
        Tanu2 t1= new Tanu2();
        t1.display();
        t1.jaan();



    }
}
