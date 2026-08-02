package JavaClassProblem;

class Rohan{
    void gender(){
        System.out.println("Rohan is a boy");
    }
}
class Rohan2 extends Rohan{
    void gender(){
        System.out.println("Rohan is a dance");
    }
}
class Rohan3 extends Rohan{
    void gender(){
        System.out.println("Rohan is eating food");
    }
}
public class DymaicMethodDispatchPriyanshu4 {
    public static void main(String[] args) {
        Rohan r1=new Rohan();
        Rohan r2 = new Rohan2();
        //Upcasting Rohan r3= new Rohan3();
        r1.gender();
        //Runtime r2.gender();
      //Runtime r3.gender();

    }
}
