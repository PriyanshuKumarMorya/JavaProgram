package OOPSinJava;
class Vechile4{
    String name;
    int year;
    double price;
    public Vechile4(String name,int year,double price){
        this.name=name;
        this.year=year;
        this.price=price;

    }
}
public class Vechilces21 {
    public static void main(String[] args) {
        Vechile4 n = new Vechile4("OD",1995,294855.9);
        System.out.println(n.name);
        System.out.println(n.year);
        System.out.println(n.price);

    }
}
