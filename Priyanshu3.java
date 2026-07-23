package JavaClassProblem;

class Vechile{
    private String name;
    private int year;
    private double price;
//    public Vechile(String name,int year,double price){
//        this.name= name;
//        this.year=year;
//        this.price=price;
//    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        year=y;
    }
    public void setPrice(double p){
        price=p;
    }
    public double getPrice(){
        return price;
    }
}
public class Priyanshu3 {
    public static void main(String[] args) {
        Vechile v1=new Vechile();
        v1.setName("Priyanshu kumar");
        v1.setPrice(38372.3);
        v1.setYear(1876);
        System.out.println(v1.getName());
        System.out.println(v1.getPrice());
        System.out.println(v1.getYear());


    }
}
