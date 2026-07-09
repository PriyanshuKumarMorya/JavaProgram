package Interface;

interface Tannu{
    String n = "I love you";
}
class Tannu1 implements Tannu{
    void display(String m){
        System.out.println(n+" "+"Priyanshu");
    }
}

public class Priyanshu2 {
    public static void main(String[] args) {
        Tannu1 t1= new Tannu1();
        t1.display("Hii");

    }
}
