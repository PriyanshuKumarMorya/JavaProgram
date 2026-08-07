package Kumkum;

class Tannu1{
    void sound(){
        System.out.println("Hello world");
    }
}
class Tannu2 extends Tannu1{
    void sound(){
        System.out.println("Hii");
    }
}
class Tannu3 extends Tannu2{
    void sound(){
        System.out.println("Bye");
    }
}

public class Tannu {

    public static void main(String[] args) {
        Tannu1 t = new Tannu1();
        Tannu1 t1 = new Tannu2();
        t.sound();
        t1.sound();


    }
}
