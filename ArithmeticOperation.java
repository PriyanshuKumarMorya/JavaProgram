import java.util.Scanner;
public class ArithmeticOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();

        System.out.println("Sum is : "+(a+b));
        System.out.println("Subratct is : "+(a-b));
        System.out.println("multiple is : "+(a*b));
        System.out.println("Divide is : "+(a/b));
        System.out.println("Modulo is : "+(a%b));
    }
}
