package Lecture;

class Priyanshu1{
    void display(){
        System.out.println("Welcome to Priyanshu Kumar");
    }
}
class Priyanshu2 extends Priyanshu1{
    void collagename(){
        System.out.println("Welcome to coer college");
    }
}
public class InheritanceSingle {
    public static void main(String[] args) {
        Priyanshu1 p = new Priyanshu1();
        p.display();
        Priyanshu2 p1 = new Priyanshu2();
        p1.collagename();
        p1.display();

    }
}
