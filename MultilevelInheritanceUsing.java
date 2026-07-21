package Lecture;

class Priyanshu3{
    void name(){
        System.out.println("I am Priyanshu Kumar");
    }
}
class Priyanshu4 extends Priyanshu3{
    void collagename(){
        System.out.println("Coer Collage");
    }
}
class Priyanshu5 extends Priyanshu4{
    void collagecuid(){
        System.out.println("CU24220027");
    }
}

public class MultilevelInheritanceUsing {
    public static void main(String[] args) {
        Priyanshu5 p = new Priyanshu5();
        p.name();
        p.collagecuid();
        p.collagename();


    }
}
