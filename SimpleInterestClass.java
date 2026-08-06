package MOM;

class Mom4{
    void display(double p){
        System.out.println("Principle is :"+p);
    }
}

class Mom5 extends Mom4{
    void show(double p,double r){
        super.display(p);
        System.out.println("Rate is : "+r);
    }
}

class Mom6 extends Mom5{
    void time(double t,double p,double r){
        super.show(p,r);
        System.out.println("Time is :"+t);
        System.out.println("Simple Interest  is : "+((p*r*t)/100));
    }
}
public class SimpleInterestClass {
    public static void main(String[] args) {
        Mom6 m1 = new Mom6();
        m1.time(2,250,25);

    }
}
