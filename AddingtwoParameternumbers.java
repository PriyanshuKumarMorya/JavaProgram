package MOM;

import java.util.Scanner;

class Mom2{
    void displays(int a,int b){
        System.out.println("Adding two numbers :" +(a+b));
    }
}

class Mom3 extends Mom2{
    void display(int a , int b){
        System.out.println("Multiple :"+(a*b));
        super.displays(a,b);
    }
}

public class AddingtwoParameternumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a frist number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        Mom3  m2 = new Mom3();
        m2.display(a,b);
    }
}
