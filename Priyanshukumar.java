package OOPSinJava;

class Priyanshu{
    void price(){
        System.out.println("Vijender and Arun goes of the $10000.");
    }
}

class Vijender extends Priyanshu{
    void price(){
        System.out.println("Vijender is $7000.");
    }
}
class Arun extends Vijender{
    void price(){
        System.out.println("Arun is $3000");
    }
}

public class Priyanshukumar {
    public static void main(String[] args){
        Priyanshu Tanu  = new Priyanshu();
        Tanu.price();
        Priyanshu Tanu1 = new Vijender();
        Tanu1.price();
        Vijender Tanu2 = new Arun();
        Tanu2.price();
        System.out.println("Vijender");

    }
}
