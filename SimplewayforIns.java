package MOM;

import java.util.Scanner;

class Mom7{
    public final int m=456;
}
class Mom8 extends Mom7{
    void add(int a,int b){
        System.out.println("Adding is : "+(a+b+m));
    }
}
class Mom9 extends Mom8{
    void Multiple(int a,int b,int c){
        super.add(a,b);
        System.out.println("Multiple is : "+(a*b*c));
    }
}

public class SimplewayforIns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a frist number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a third number: ");
        int c = sc.nextInt();
        Mom9 m1= new Mom9();
        m1.Multiple(a,b,c);

    }
}
