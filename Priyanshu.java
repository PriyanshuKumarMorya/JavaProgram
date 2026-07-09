package Interface;

interface Area{
    final static double pi = 3.14F;
}
class Rectangle implements Area{
    void display(double a,double n){
        System.out.println(a*n);
    }}
class Circle implements Area{
    void display(double a , double n){
        System.out.println(pi*n*a);
    }
}
public class Priyanshu {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.display(6,7);
        Circle c = new Circle();
        c.display(9,2);
    }
}
