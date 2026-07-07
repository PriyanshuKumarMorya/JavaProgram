package MOM;
import java.util.Scanner;

class Mom10{
    void patternsquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
class Mom11 extends Mom10{
    void triangle(int m,int h){
        super.patternsquare(m);
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a extra number: ");
        int h = sc.nextInt();
        Mom11 m2= new Mom11();
        m2.triangle(n,h);

    }
}
