package Hritik;

interface HelloWorld1{
    final  static int n = 3;
    void display(int a,int b,int v);
}
class Ritika extends Ritika3 implements HelloWorld1{
    public void display(int a , int b,int v){
        System.out.println(n+a+b);
        super.sum1(a,b);
    }
}
class Ritika1{
    void sum(int m,int d){
        System.out.println("sum :"+(m+d));

    }

}
class Ritika3 extends Ritika1{
    void sum1(int q,int y){
        System.out.println(q+y);
        super.sum(q,y);
    }
}

public class InterfaceHritik {
    public static void main(String[] args) {
        Ritika r1= new Ritika();
        r1.display(1,6,8);


    }
}
